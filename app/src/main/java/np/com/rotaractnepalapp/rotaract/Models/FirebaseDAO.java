package np.com.rotaractnepalapp.rotaract.Models;

import android.content.Context;
import android.support.annotation.NonNull;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;
import com.google.firebase.database.DataSnapshot;
import com.google.firebase.database.DatabaseError;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;
import com.google.firebase.database.ValueEventListener;
import com.google.firebase.storage.FirebaseStorage;
import com.google.firebase.storage.StorageReference;

import java.io.Serializable;

public class FirebaseDAO implements Serializable {

    // objects for firebase Realtime database
    private FirebaseDatabase connectionObject;
    private DatabaseReference dbReference,tokenReference;
    private boolean flag;
    //objects for firebase user authentication
    private FirebaseAuth authenticationObject;
    private FirebaseUser firebaseUser;

    //objects for firebase storage
    private FirebaseStorage storageObject;
    private StorageReference storageReference;

    //static firebaseDAO object and accor to the all the objects specified above
    private static FirebaseDAO firebaseDAOObject;
     public static String UID,CHAT_ID;

    public static ValueEventListener valueEventListener=new ValueEventListener() {

        @Override
            public void onDataChange(@NonNull DataSnapshot dataSnapshot) {
                getFirebaseDAOObject().getDbReference()
                .child("users")
                        .child(FirebaseDAO.UID)
                        .child("online").onDisconnect().setValue(false);

                getFirebaseDAOObject().getDbReference().child("users")
                        .child(FirebaseDAO.UID)
                        .child("online").setValue(true);
            }

            @Override
            public void onCancelled(@NonNull DatabaseError databaseError) {
            }
    };

    public DatabaseReference getTokenReference() {
        return tokenReference;
    }

    private FirebaseDAO(){
        //link to database url
            connectionObject = FirebaseDatabase.getInstance();

        //link to parent node or root node in database
        dbReference=connectionObject.getReference();

        //object for handling user authentication
        authenticationObject=FirebaseAuth.getInstance();

        //current user object logged into the database
        firebaseUser=authenticationObject.getCurrentUser();

        //obtaining storage object
        storageObject=FirebaseStorage.getInstance();

        //obtaining root storage reference
        storageReference=storageObject.getReference();

        tokenReference=dbReference.child("DeviceTokens");

    }

    public FirebaseStorage getStorageObject() {
        return storageObject;
    }

    public void setStorageObject(FirebaseStorage storageObject) {
        this.storageObject = storageObject;
    }

    public StorageReference getStorageReference() {
        return storageReference;
    }

    public void setStorageReference(StorageReference storageReference) {
        this.storageReference = storageReference;
    }

    public FirebaseDatabase getConnectionObject() {
        return connectionObject;
    }

    public void setConnectionObject(FirebaseDatabase connectionObject) {
        this.connectionObject = connectionObject;
    }

    public DatabaseReference getDbReference() {
        return dbReference;
    }

    public void setDbReference(DatabaseReference dbReference) {
        this.dbReference = dbReference;
    }

    public FirebaseAuth getAuthenticationObject() {
        return authenticationObject;
    }

    public void setAuthenticationObject(FirebaseAuth authenticationObject) {
        this.authenticationObject = authenticationObject;
    }

    public FirebaseUser getFirebaseUser() {
        return firebaseUser;
    }

    public void setFirebasUser(FirebaseUser firebasUser){
        this.firebaseUser=firebasUser;
    }

    private void setFirebaseUser(FirebaseUser firebaseUser) {
        this.firebaseUser = firebaseUser;
    }

    public static FirebaseDAO getFirebaseDAOObject() {

        if(firebaseDAOObject==null)
            return firebaseDAOObject= new FirebaseDAO();
        else
            return firebaseDAOObject;
    }



    public void saveDeviceTokens(final Context context, String uid, String token){
        tokenReference.child(uid).child("deviceToken").setValue(token)
        .addOnCompleteListener(new OnCompleteListener<Void>() {
            @Override
            public void onComplete(@NonNull Task<Void> task) {
                if(task.isSuccessful())
                {
                    //no code required to respond to succesful task
                }
                else
                {
                    Toast.makeText(context,task.getException().toString(),Toast.LENGTH_LONG).show();
                }

            }
        });
    }
}
