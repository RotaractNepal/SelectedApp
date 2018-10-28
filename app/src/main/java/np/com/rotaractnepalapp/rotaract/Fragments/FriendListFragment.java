package np.com.rotaractnepalapp.rotaract.Fragments;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.TextView;

import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.ValueEventListener;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Activity.CommonActivity;
import np.com.rotaractnepalapp.rotaract.Activity.ConversationActivity;
import np.com.rotaractnepalapp.rotaract.Models.FirebaseDAO;
import np.com.rotaractnepalapp.rotaract.Models.User;
import np.com.rotaractnepalapp.rotaract.R;

public class FriendListFragment extends Fragment implements CommonActivity {

    private View parentView;
    private ListView friendList,receivedRequestList,sentRequestList;
    private ArrayList<User> friendsArray,friendRequestsArray,sentRequestsArray;
    private String[] strings;
    private String userID;
    private User user;
    private FirebaseDAO firebaseDAO;
    private FriendListAdapter FLAdapter;
    private ReceivedRequestListAdapter RRLAdapter;
    private SentRequestListAdapter SRLAdapter;
    private OptionalAdapter optionalAdapter;


    public FriendListFragment() {
    }

    @Override
    public void onResume() {
        super.onResume();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        try{
        parentView =inflater.inflate(R.layout.fragment_friend_list, container, false);

        //initialized parentView so that findViewByID could be used later
        return parentView;
        }
        catch (Exception e)
        {
            return  null;
        }
    }

    @Override
    public void onStart() {
        super.onStart();
        initializeViews();
        loadReceivedRequests();
        loadSentFriendRequests();
        loadFriendsIntoList();
    }

    @Override
    public void initializeViews() {

        firebaseDAO=FirebaseDAO.getFirebaseDAOObject();
        friendList= parentView.findViewById(R.id.friendLists);
        receivedRequestList= parentView.findViewById(R.id.receivedRequestLists);
        sentRequestList= parentView.findViewById(R.id.sentRequestLists);
        friendsArray=new ArrayList<>();
        friendRequestsArray=new ArrayList<>();
        sentRequestsArray=new ArrayList<>();

            FLAdapter = new FriendListAdapter(parentView.getContext(), R.layout.friend_item, friendsArray);

            SRLAdapter=new SentRequestListAdapter(parentView.getContext(),
                            R.layout.sent_request_item,sentRequestsArray);

            RRLAdapter=new ReceivedRequestListAdapter(parentView.getContext(),
                                                        R.layout.received_request_item,
                                                        friendRequestsArray);

            friendList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                TextView fullName=view.findViewById(R.id.fullNameFriendItem);
                TextView uid=view.findViewById(R.id.uidFriendItem);
                TextView imageURI=view.findViewById(R.id.IMAGE_URI_FriendItem);
                Intent i=new Intent(getActivity(),ConversationActivity.class);
                i.putExtra("fullname",fullName.getText());
                i.putExtra("targetUserID",uid.getText());
                i.putExtra("imageURI",imageURI.getText());
                startActivity(i);
            }
        });
    }

    @Override
    public boolean validateFields() {
        return false;
    }

    public void loadSentFriendRequests(){
        try {
            sentRequestsArray.clear();
            firebaseDAO.getDbReference()
                    .child("Requests")
                    .child(FirebaseDAO.UID)
                    .child("sentTo")
                    .orderByKey()
                    .addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                            if (dataSnapshot.hasChildren()) {

                                sentRequestList.setAdapter(SRLAdapter);
                                for (DataSnapshot snap : dataSnapshot.getChildren()) {

                                    firebaseDAO.getDbReference()
                                            .child("users")
                                            .child(snap.getKey())
                                            .addValueEventListener(new ValueEventListener() {
                                                @Override
                                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                                    User user = new User(
                                                            dataSnapshot.getKey(),
                                                            dataSnapshot.child("fName").getValue(String.class),
                                                            dataSnapshot.child("lName").getValue(String.class),
                                                            dataSnapshot.child("country").getValue(String.class),
                                                            dataSnapshot.child("state").getValue(String.class),
                                                            dataSnapshot.child("pp_path").getValue(String.class)
                                                    );
                                                    sentRequestsArray.add(user);
                                                    SRLAdapter.notifyDataSetChanged();
                                                }

                                                @Override
                                                public void onCancelled(@NonNull DatabaseError databaseError) {
                                                }
                                            });

                                }
                            } else {
                                strings = new String[]{"No sent requests found"};
                                optionalAdapter = new OptionalAdapter(parentView.getContext(),
                                        R.layout.no_records_found, strings);
                                sentRequestList.setAdapter(optionalAdapter);
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {
                        }
                    });

        }
        catch (Exception e){
            Log.e("Exception Caught",e.getMessage());
        }
    }

    public void loadReceivedRequests(){
        try {
            friendRequestsArray.clear();

            firebaseDAO.getDbReference()
                    .child("Requests")
                    .child(FirebaseDAO.UID)
                    .child("receivedFrom")
                    .orderByKey()
                    .addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {

                            if (dataSnapshot.hasChildren()) {

                                receivedRequestList.setAdapter(RRLAdapter);
                                for (DataSnapshot snap : dataSnapshot.getChildren()) {

                                    firebaseDAO.getDbReference()
                                            .child("users")
                                            .child(snap.getKey())
                                            .addValueEventListener(new ValueEventListener() {
                                                @Override
                                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                                    User user = new User(
                                                            dataSnapshot.getKey(),
                                                        dataSnapshot.child("fName").getValue(String.class),
                                                        dataSnapshot.child("lName").getValue(String.class),
                                                        dataSnapshot.child("country").getValue(String.class),
                                                        dataSnapshot.child("state").getValue(String.class),
                                                        dataSnapshot.child("pp_path").getValue(String.class)
                                                    );
                                                    friendRequestsArray.add(user);
                                                    RRLAdapter.notifyDataSetChanged();
                                                }

                                                @Override
                                                public void onCancelled(@NonNull DatabaseError databaseError) {
                                                }
                                            });

                                }
                            } else {
                                strings = new String[]{"No Friend requests"};
                                optionalAdapter = new OptionalAdapter(parentView.getContext(),
                                        R.layout.no_records_found, strings);
                                receivedRequestList.setAdapter(optionalAdapter);
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {
                        }
                    });
        }
        catch (Exception e)
        {
            Log.e("Exception Occured",e.getMessage());
        }
    }

    public void loadFriendsIntoList() {
        try {
            friendsArray.clear();

            firebaseDAO.getDbReference()
                    .child("FriendLists")
                    .child(FirebaseDAO.UID)
                    .orderByKey()
                    .addValueEventListener(new ValueEventListener() {
                        @Override
                        public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                            if (dataSnapshot.hasChildren()) {

                                friendList.setAdapter(FLAdapter);
                                for (DataSnapshot achild : dataSnapshot.getChildren()) {

                                    firebaseDAO.getDbReference()
                                            .child("users")
                                            .child(achild.getKey())
                                            .addValueEventListener(new ValueEventListener() {
                                                @Override
                                                public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                                                    User user = new User(
                                                            dataSnapshot.getKey(),
                                                            dataSnapshot.child("fName").getValue(String.class),
                                                            dataSnapshot.child("lName").getValue(String.class),
                                                            dataSnapshot.child("country").getValue(String.class),
                                                            dataSnapshot.child("state").getValue(String.class),
                                                            dataSnapshot.child("pp_path").getValue(String.class)
                                                    );
                                                    friendsArray.add(user);
                                                    FLAdapter.notifyDataSetChanged();
                                                }

                                                @Override
                                                public void onCancelled(@NonNull DatabaseError databaseError) {
                                                }
                                            });
                                }
                            } else {
                                strings = new String[]{"No Friends found"};

                                optionalAdapter = new OptionalAdapter(parentView.getContext(),
                                        R.layout.no_records_found, strings);
                                friendList.setAdapter(optionalAdapter);
                            }
                        }

                        @Override
                        public void onCancelled(@NonNull DatabaseError databaseError) {
                        }
                    });
        }
        catch (Exception e)
        {
            Log.e("Exception Occured",e.getMessage());
        }
    }
}
















