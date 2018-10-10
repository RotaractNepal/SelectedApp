package np.com.rotaractnepalapp.rotaract.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.MenuItem;

import com.rengwuxian.materialedittext.MaterialEditText;

import java.util.ArrayList;

import np.com.rotaractnepalapp.rotaract.Adapter.BloodGroupAdapter;
import np.com.rotaractnepalapp.rotaract.Class.BloodGroupClass;
import np.com.rotaractnepalapp.rotaract.R;

public class BloodSearch extends AppCompatActivity {

    MaterialEditText editTextSearch;
    RecyclerView recyclerView;
    RecyclerView.LayoutManager layoutManager;
    BloodGroupAdapter adapter;
    ArrayList<BloodGroupClass> bloodGroupClasses;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_blood_search);
        this.setTitle("Blood Search");
        if(getSupportActionBar() != null){
            getSupportActionBar().setDisplayHomeAsUpEnabled(true);
            getSupportActionBar().setDisplayShowHomeEnabled(true);
        }

        getBloodGroup();
        buildRecylerView();

        editTextSearch = (MaterialEditText) findViewById(R.id.editTextSearch);
        editTextSearch.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

            }

            @Override
            public void afterTextChanged(Editable s) {
                filter(s.toString());
            }
        });

    }

    private void filter(String text){
        ArrayList<BloodGroupClass> filteredList = new ArrayList<>();
        for (BloodGroupClass item : bloodGroupClasses){
            if (item.getBloodgroup().toLowerCase().contains(text.toLowerCase()) || item.getClubshortname().toUpperCase().contains(text.toUpperCase())){
                filteredList.add(item);
            }
        }
        adapter.filterList(filteredList);

    }

    private void getBloodGroup(){
        bloodGroupClasses = new ArrayList<>();

        //A+ blood Group List
        bloodGroupClasses.add(new BloodGroupClass("Aachal Bhandari", "A+", "9812939365", "bhandariaachu123@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("Aadarsh Shrestha", "A+", "9861641639", "aadarshashrestha17@gmail.com", "", "RAC Tripureshwor","( RACT )"));
        bloodGroupClasses.add(new BloodGroupClass("Aadhar Babu Khatiwada", "A+", "9866019746", "aadhubabu88@gmail.com", "", "RAC Balaju","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Aaditya Dhungana", "A+", "9846002652", "dhunganaaaaditya@gmail.com", "Milan Chowk, Hemja", "RAC Hemja","( RACH )"));
        bloodGroupClasses.add(new BloodGroupClass("Aaditya Maharjan", "A+", "9860676750", "bakaluffymonkey120@gmail.com", "", "RAC Jawalakhel","( RACJ )"));
        bloodGroupClasses.add(new BloodGroupClass("Aakanksha Kunwar", "A+", "9843670104", "kunwaraakanksha251@gmail.com", "Rotary Bhawan, Thapathali, Kathmandu", "RAC Kathmandu","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Aakriti Baniya", "A+", "9840266897", "aakritibaniya87@gmai.com", "Thapagaun, New Baneswor, Kathmandu", "RAC Durbarmarg","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Aanan Sewa", "A+", "9865074192", "aanansewan25@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Aashish Shakya", "A+", "9806507220", "shish23shakya.aa@gmail.com", "Pokhara Lekhnath", "RAC Newroad Pokhara","( RACNP )"));
        bloodGroupClasses.add(new BloodGroupClass("Aashma Rizal", "A+", "9867806362", "aashmarizal1996@gmail.com", "Thames Int. College, Surya Bikram Gyawali Marg, Battisputali, Old Banshwor", "RAC Thames International College","( RACTIC )"));
        bloodGroupClasses.add(new BloodGroupClass("Aashutosh Badal", "A+", "9843630283", "aashutoshbadal.1227@gmail.com", "", "RAC Kopundol","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Aastha Joshi", "A+", "9803906996", "aasthajoshi201@gmail.com", "", "RAC Balaju","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Aastha Pandey", "A+", "9847035525", "aasthapandey39@gmail.com", "Butwal, Nepal", "RAC Tinau Butwal","( RACTB )"));
        bloodGroupClasses.add(new BloodGroupClass("Aaswastha Kaphle", "A+", "9806587830", "aaswasthakafle.2014@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Aavash Mishra", "A+", "9843009100", "elsoprano7@gmail.com", "Dillibazar, Kathmandu", "RAC Dillibazar-Kathmandu","( RACDK )"));
        bloodGroupClasses.add(new BloodGroupClass("Abhisek Kunwar", "A+", "9827179055", "abisekbuffon1236@gmail.com", "Milan Chowk, Hemja", "RAC Hemja","( RACH )"));
        bloodGroupClasses.add(new BloodGroupClass("Abhisekh Joshi", "A+", "9865609852", "abhi.joc@outlook.com", "", "RAC Kantipur Dental College","( RACKDC )"));
        bloodGroupClasses.add(new BloodGroupClass("Abhishek Manandhar", "A+", "9841618184", "abhishek.manandhar10@gmail.com", "Thapagaun, New Baneswor, Kathmandu", "RAC Durbarmarg","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Abhishek Shah", "A+", "9849594495", "abhishekl.gnr@gmail.com", "", "RAC Jawalakhel Manjushree","( RACJM )"));
        bloodGroupClasses.add(new BloodGroupClass("Active Taujale", "A+", "9841131068", "brook_taujale@yahoo.com", "", "RAC Banepa","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Adity karanjeet", "A+", "9818841982", "Adtk005@gmail.com", "Dhumbarahi, Kathmandu", "RAC Kathmandu Metro","( RACKM )"));
        bloodGroupClasses.add(new BloodGroupClass("Aditya Rayamajhi", "A+", "9821219635", "jungaaditya@gmail.com", "Ratnanagar-9, Chitwan, Nepal", "RAC Ratnanagar","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Ajusha Rizal", "A+", "9841486844", "ajusha16@gmail.com", "", "RAC Balaju","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Alaz Adhikari", "A+", "9865194275", "elaz.adh@gmail.com", "Ratnanagar-9, Chitwan, Nepal", "RAC Ratnanagar","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Albina Chhetri", "A+", "9860471611", "albina.chhetri21@gmail.com", "RAC Kantipur Dental College", "RAC Kantipur Dental College","( RACKDC )"));
        bloodGroupClasses.add(new BloodGroupClass("Alina Aryal", "A+", "9865162269", "alinaaryal2057@gmail.com", "Ratnanagar-9, Chitwan, Nepal", "RAC Ratnanagar","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Alina Chhantel", "A+", "9808751907", "alinachhantel@gmail.com", "", "RAC Himalaya Patan","( RACHP )"));
        bloodGroupClasses.add(new BloodGroupClass("Alisha Neupane", "A+", "9840064328", "alishaneupane2010@yahoo.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Alisha Shrestha", "A+", "9846727891", "alishastha583@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Ameesha Shiwakoti", "A+", "9845156460", "ameesha.shiwakoti1@gmail.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Amira Karki", "A+", "9851021486", "karkiarima@gmail.com", "Panauti, Nepal", "RAC Panauti","( RACP )"));
        bloodGroupClasses.add(new BloodGroupClass("Amisha Baral", "A+", "9819161576", "amishabaral023@gmail.com", "Pokhara Lekhnath", "RAC Newroad Pokhara","( RACNP )"));
        bloodGroupClasses.add(new BloodGroupClass("Amisha Lama", "A+", "9808324076", "amishalama456@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("AMISHA MAHARJAN", "A+", "9813534622", "amishamhrjn@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKSMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Amrit Khanal", "A+", "9857059505", "akdhuwa15@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("Amrit Lamichane", "A+", "9845839717", "mr.amrit.lamichhane@gmail.com", "", "RAC Hetauda","( RACH )"));
        bloodGroupClasses.add(new BloodGroupClass("Amrita Adhikari", "A+", "9865256352", "amrita.adhikari73@gmail.com", "Ratnanagar-9, Chitwan, Nepal", "RAC Ratnanagar","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Amul Shrestha", "A+", "9840096668", "coctail8121@gmail.com", "Panauti, Nepal", "RAC Panauti","( RACP )"));
        bloodGroupClasses.add(new BloodGroupClass("Anamika Tamang", "A+", "9864396493", "annamikatamang@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Anisha Shrestha", "A+", "9813827721", "tellanisha@gmail.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("Anita Bhusal", "A+", "9867184299", "bhusalanita299@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("Anjana Poudel", "A+", "9846060444", "anjanapoudel879@gmail.com", "Milan Chowk, Hemja", "RAC Hemja","( RACH )"));
        bloodGroupClasses.add(new BloodGroupClass("Anjita Pandey", "A+", "9847499630", "ngtapandey55@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("Ankush Adhikari", "A+", "9845232374", "ankuss78@gmail.com", "", "RAC Tripureshwor","( RACT )"));
        bloodGroupClasses.add(new BloodGroupClass("Anu Rana", "A+", "9825113755", "anuranathakuri@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Anu Shrestha", "A+", "9802952445", "anu.shrestha534@gmail.com", "", " RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Anu Tamang", "A+", "9860909356", "anutamangmnop@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Anugya Shrestha", "A+", "9823788781", "anugya49@gmail.com", "", "RAC Kathmandu University","( RACKU )"));
        bloodGroupClasses.add(new BloodGroupClass("Anuj Ranjit", "A+", "9851248554", "anujranjit11@gmail.com", "", "RAC Banepa","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Anuj Shrestha", "A+", "9841047689", "anujshrestha007@gmail.com", "Thapagaun, New Baneswor, Kathmandu", "RAC Durbarmarg","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Anuja Adhikari", "A+", "9860080156", "Anujaadhi7@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Anup Maharjan", "A+", "9849376662", "mjanup11@gmail.com", "", "RAC Jawalakhel Manjushree","( RACJM )"));
        bloodGroupClasses.add(new BloodGroupClass("Anupama Pandeya", "A+", "9843314550", "thibianupama11@gmail.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("ANUSHA NEUPANE KHATRI", "A+", "9823532552", "anushakhatri1123@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("ANUSHA SHRESTHA", "A+", "9860953657", "shrestha.anushaa29@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Arati Poudel", "A+", "9845712199", "poudelarati1@gmail.com", "kathmandu, Nepal", "RAC Rudramati","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Arjan Shrestha", "A+", "9867824209", "dsubedi450@gmail.com", "", "RAC Butwal","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Arjun Belbase", "A+", "", "barjun2549@gmail.com", "", "RAC Kapilvastu Mid-Town","( RACKMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Arjun Gupta", "A+", "9846751156", "arjun.plancks@gmail.com", "Kutumba Cafe, Mahendrapool Pokhara", "RAC Pokhara Mid Town","( RACPMT )"));
        bloodGroupClasses.add(new BloodGroupClass("ARPANA ACHARYA", "A+", "9826188955", "anu.ach15@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Arun Bhattrai", "A+", "9800719992", "arunbhattrai.150@gmail.com", "", "RAC Kapilvastu Mid-Town","( RACKMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Asha Bhandari", "A+", "9847281345", "asu.june@gmail.com", "Siddharthanagarpalika-07, Bhairahawa, Rupandehi, Nepal", "RAC Central Lumbini","( RACCL )"));
        bloodGroupClasses.add(new BloodGroupClass("Ashina Maharjan", "A+", "9843822106", "2014aashu@gmail.com", "Lohala, Lalitpur", "RAC Patan Durbar Square","( RACPDS )"));
        bloodGroupClasses.add(new BloodGroupClass("Ashish Khadka", "A+", "9818838504", "akhadka101@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("ASHISH SHAH", "A+", "9840096722", "aasys4u@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Ashmita Karki", "A+", "9862263305", "karkiasmita48@gmail.com", "", "RAC Kantipur Dental College","( RACKDC )"));
        bloodGroupClasses.add(new BloodGroupClass("Ashok Gupta", "A+", "9857011224", "ashok.gupta21@gmail.com", "Siddharthanagar -08 , Bhairahawa Rupandehi, Nepal", "RAC Lumbini Siddhartha Nagar","( RACLSN )"));
        bloodGroupClasses.add(new BloodGroupClass("Ashok Khadka", "A+", "9816190677", "khadkashok@gmail.com", "Pokhara Lekhnath", "RAC Newroad Pokhara","( RACNP )"));
        bloodGroupClasses.add(new BloodGroupClass("Ashok Shrestha", "A+", "9802921378", "snowdesertashok@gmail.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Ashutosh Kc", "A+", "9849736922", "kcashutosh@gmail.com", "Panauti, Nepal", "RAC Panauti","( RACP )"));
        bloodGroupClasses.add(new BloodGroupClass("Asim Shrestha", "A+", "9851052331", "asimshr10@gmail.com", "", "RAC Balaju","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Asmit Karki", "A+", "9847629687", "asimit.karki@gmail.com", "Pokhara Lekhnath", "RAC Newroad Pokhara","( RACNP )"));
        bloodGroupClasses.add(new BloodGroupClass("ASTOSH SAYENJU", "A+", "9818055385", "ashutoshsayenju@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Atit Malla", "A+", "9846345972", "atitmalla54@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("Atul Awale", "A+", "9849674433", "Awalekuma54@gmail.com", "", "RAC Patan","( RACP )"));
        bloodGroupClasses.add(new BloodGroupClass("Avaya Lal Shrestha", "A+", "9849135524", "shresthaabhay@gmail.com", "", "RAC Balaju","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("AYUSH NEUPANE", "A+", "9861538333", "ayushneupane255@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Babita Neupane", "A+", "9844482563", "babita.neupane14@gmail.com", "Rotary Bhawan, Thapathali, Kathmandu", "RAC Kathmandu","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Basant Tamrakar", "A+", "9841659874", "basantamrakar3212@gmail.com", "Panauti, Nepal", "RAC Panauti","( RACP )"));
        bloodGroupClasses.add(new BloodGroupClass("Basanta Lamsal", "A+", "9843535686", "basant.lamsal7@gmail.comDang, Rapti", "", "RAC Dang","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Beduram Pokhrel", "A+", "9843883240", "beduram.pokhrel125@gmail.com", "", "RAC Kapilvastu Mid-Town","( RACKMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Bhagyashree Malla", "A+", "9817555706", "mallashree@yahoo.co.uk", "", "RAC Kantipur Dental College","( RACKDC )"));
        bloodGroupClasses.add(new BloodGroupClass("Bhawana Rai", "A+", "9841223174", "Vawanarai2013@gmail.com", "Thapagaun, New Baneswor, Kathmandu", "RAC Durbarmarg","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Bhawana Thapa", "A+", "9806790228", "bhawanathapa6@gmail.com", "Kutumba Cafe, Mahendrapool Pokhara", "RAC Pokhara Mid Town","( RACPMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Bhimlal Bhattarai", "A+", "", "poetshayar@gmail.com", "", "RAC Kapilvastu Mid-Town","( RACKMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Bhusal Shisir", "A+", "", "shishirbhusal2014@gmail.com", "", "RAC Kapilvastu Mid-Town","( RACKMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Bijay Gupta", "A+", "9867118196", "Guptawcosmetic7.bg@gmail.com", "butwal devinagar ", "RAC Butwal South","( RACBS )"));
        bloodGroupClasses.add(new BloodGroupClass("Bikina Sainju", "A+", "9843439664", "sainjubikina2075@gmail.com", "", "RAC Banepa","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("BIKRAM KAJI SHAKYA", "A+", "9860305856", "bikramkaji123@gmail.com", "", "RAC Palpa Tansen","( RACPT )"));
        bloodGroupClasses.add(new BloodGroupClass("Bikram KC", "A+", "9847134561", "kcbikram81@gmail.com", "", "RAC Kapilvastu","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Bikram Oli", "A+", "9864001882", "olibikram63@gmail.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("Bimal Bahadur Gurung", "A+", "9818314020", "undisputedbimal@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Bimal Gyawali", "A+", "9843860501", "gyawalibimal218@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("Bimal Paudel", "A+", "9847248190", "bimalpaudel492@gmail.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Bindu Shree Ale Magar", "A+", "9824196219", "bindushreeale40@gmail.com", "", "RAC Annapurna","( RACA )"));
        bloodGroupClasses.add(new BloodGroupClass("Binisha Sapkota", "A+", "9861438025", "sapkota.benisha@gmail.com", "", "RAC Balaju","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Binita Karki", "A+", "9807987576", "karki.meena07@gmail.com", "Lohala, Lalitpur", "RAC Patan Durbar Square","( RACPDS )"));
        bloodGroupClasses.add(new BloodGroupClass("Binita kuikel", "A+", "9808866707", "Binitakuikel077@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Bipin Neupane", "A+", "9847508076", "bipinneupane793@gmail.com", "Butwal Devinagar", "RAC Butwal South","( RACBS )"));


        //A- Blood Group List
        bloodGroupClasses.add(new BloodGroupClass("Aabish Dahal", "A-", "98617944400", "aabish101@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("ABHAS REGMI", "A-", "9843215911", "regmiabhas@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Ajay Gautam", "A-", "9817241442", "gajay6223@gmail.com", "", "RAC Hetauda","( RACH )"));
        bloodGroupClasses.add(new BloodGroupClass("Ajit Baral", "A-", "9846440046", "sylvaster9846440046@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Anita Thapa", "A-", "9842692775", "aneetahsharad@gmail.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("Anjila Pandey", "A-", "9810860209", "anjilapandey@gmail.com", "Dang, Rapti", "RAC Dang","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Arzoo Prasai", "A-", "9843238358", "arzooprasai@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Binay Legal", "A-", "9803354354", "binay.ligal@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Biswas Kharel", "A-", "9867126941", "Bishukharel98@gmail.com", "Butwal Devinagar ", "RAC Butwal South","( RACBS )"));
        bloodGroupClasses.add(new BloodGroupClass("Manika Humagai", "A-", "9843091747", "manikahumagai2013@gmail.com", "Panauti, Nepal", "RAC Panauti","( RACP )"));
        bloodGroupClasses.add(new BloodGroupClass("Pabin Karki", "A-", "9841856444", "karki.pabin@gmail.com", "", "RAC Bagmati","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Aakriti Khadka", "A-", "9803109458", "aaku.khadka97@gmail.com", "", "RAC Pokhara GMC","( RACPGMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Aayush paudel", "A-", "9866821222", "aayushpaudel1998@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Ajita Karki", "A-", "9849297710", "karkiajita4@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Anita Soti", "A-", "9819476817", "sotianita481@gmail.com", "Pokhara-17, Birauta Damside Road, Kaski (C/O NESDO Nepal)", "RAC Parbat Pokhara","( RACPP )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Ankit Manandhar", "A-", "9841329358", "addemail@please.com", "", "RAC Kathmandu West","( RACKW )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Bal Bahadur Thapa", "A-", "9857622414", "baluthapa45@gmail.com", "Baglung Municipality", "RAC Baglung","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Bikram Yadav", "A-", "9860021305", "bikramyadav123@gmail.com", "Dhulikhel, Kavre", "RAC Kathmandu University Medical School","( RACKUMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Dinesh kandel", "A-", "", "addemail@please.com", "", "RAC Bharatpur","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Durga Poudel", "A-", "9857042012", "durgapdl2052@gmail.com", "", "RAC Rupandehi","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. jagriti chaudhary", "A-", "9845866647", "ch1.ruchee1@gmail.com", "Thames Int. College, Surya Bikram Gyawali Marg, Battisputali, Old Banshwor", "RAC Thames International College","( RACTIC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Manoj Gautam", "A-", "9857059738", "gautam.manoj120@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Mridul Acharya", "A-", "9801071700", "acharyamridul@yahoo.com", "Rotary Bhawan, Thapathali, Kathmandu", "RAC Kathmandu","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Neesha Lamichhane", "A-", "9845617359", "addemail@please.com", "Ratnanagar-9, Chitwan, Nepal", "RAC Ratnanagar","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Nikesh Khanal", "A-", "984360617", "nifour_nikesh@yahoo.com", "Ratnanagar-9, Chitwan, Nepal", "RAC Ratnanagar","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Pramila Bhandari", "A-", "9846562641", "Hostnancy123@yahoo.com", "", "RAC Pokhara Fishtail","( RACPF )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Pranav Shrestha", "A-", "9841507295", "shrestha_pranav528@hotmail.com", "Kathmandu,Nepal", "RAC Rajdhani","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Rubesh Makaju Shrestha", "A-", "9843573719", "mk13.rm@gmail.com", "", "RAC Dhulikhel","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Rumee Shrestha", "A-", "9841957920", "rumeeshrest@gmail.com", "Mangalbazar", "RAC Patan West","( RACPW )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Samrajya Khadka", "A-", "+61-450646075", "samrajyakhadka98@gmail.com", "Jawalakhel", "RAC Patan South","( RACPS )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Sanjeev Karki", "A-", "9867740517", "sanjeevkarki@gmail.com", "Pokhara Lekhnath-9, Kaski", "RAC Pokhara","( RACP )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Shibika Thapa", "A-", "9862079422", "butterflythapa@gmail.com", "Kathmandu Medical College 184 Baburam Acharya Sadak, Sinamangal, Kathmandu, Nepal.", "RAC Kathmandu Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Shonu Sunar", "A-", "9806773990", "crossthestation@hotmail.com", "", "RAC Pokhara Fishtail","( RACPF )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Sima Sunar", "A-", "9806626000", "cmasen25@hotmail.com", "", "RAC Pokhara Fishtail","( RACPF )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Suraj Nhasiju Shrestha", "A-", "9843426958", "shresthasuraj46974@gmail.com", "", "RAC Dhulikhel","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Suresh Bhandari", "A-", "9847272111", "suresh.bndri@gmail.com", "", "RAC Rupandehi","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Tika Ram Paneru", "A-", "9801042055", "tikagalaxy@gmail.com", "vyas 02 damauli tanahun", "RAC Damauli","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Sarbesh Rijal", "A-", "9841080298", "sarbeshrizal@gmail.com", "Rotary Bhawan, Thapathali, Kathmandu", "RAC Kathmandu","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Shrijana Thapa", "A-", "9863800854", "srizanathapa694@gmail.com", "Pragati Shikshya Sadan, Kupondole", "RAC Mount Everest, Lalitpur","( RACMEL )"));
        bloodGroupClasses.add(new BloodGroupClass("Snigdha Amatya", "A-", "9849592017", "snighdhaamatya@gmail.com", "", "RAC Kopundol","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Sujan Baruwal", "A-", "9856058333", "amstersujan@gmail.com", "Kutumba Cafe, Mahendrapool Pokhara", "RAC Pokhara Mid Town","( RACPMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Sujan Nepali", "A-", "9861182954", "sujannepali7@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass(" Ujjwal Manandhar", "A-", "9843598076", "mija.sayami@gmail.com", "", "RAC New Road City","( RACNRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Uruma Basnet", "A-", "9860110700", "basneturuma@gmail.com", "Panauti, Nepal", "RAC Panauti","( RACP )"));

        //B+ Blood Group List
        bloodGroupClasses.add(new BloodGroupClass("Aaditya Dhungana", "B+", "9827179647", "aadityadhungana6@gmail.com", "vyas 02 damauli tanahun", "RAC Damauli","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Aakash Chemjong", "B+", "9812304698", "aakashlimbu8586@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Aakash Kumar Gupta", "B+", "9845900774", "iamaakash.ag@gmail.com", "", "RAC Hetauda","( RACH )"));
        bloodGroupClasses.add(new BloodGroupClass("Aarju Gaihre", "B+", "9860030371", "aarju.gaihre@gmail.com", "", "RAC Tripureshwor","( RACT )"));
        bloodGroupClasses.add(new BloodGroupClass("Aarti Gupta", "B+", "9801640004", "gupta4aarri@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Aasish Wagle", "B+", "9840062003", "president1819rackne@gmail.com", "", "RAC Kathmandu North East","( RACKNE )"));
        bloodGroupClasses.add(new BloodGroupClass("Aastha Thapa", "B+", "9844791830", "aasthapa3@gmail.com", "", "RAC Hetauda","( RACH )"));
        bloodGroupClasses.add(new BloodGroupClass("Abhinav Rayamajhi", "B+", "9860476001", "abrayamajhi@gmail.com", "", "RAC Kathmandu University","( RACKU )"));
        bloodGroupClasses.add(new BloodGroupClass("ABHIRAJ MISHRA", "B+", "9849673824", "m_abhiraj@yahoo.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Abhishek Neupane", "B+", "9847841930", "neupaneabhishek@gmail.com", "", "RAC Kathmandu University","( RACKU )"));
        bloodGroupClasses.add(new BloodGroupClass("Abhishek Shakya", "B+", "9849673160", "shakyavi@gmail.com", "", "RAC Balaju","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Achyut Paudel", "B+", "9856059033", "tellmeat2@hotmail.com", "Kutumba Cafe, Mahendrapool Pokhara", "RAC Pokhara Mid Town","( RACPMT )"));
        bloodGroupClasses.add(new BloodGroupClass("ALINA POUDEL", "B+", "9860901343", "alinapoudel01@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Alisha Poudel", "B+", "9849575232", "alishapoudel64@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("ALISHA SURKHETI", "B+", "9860552733", "alee.sha347@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("ALMA SINGH", "B+", "9840093028", "almasubedi@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Alok Yadav", "B+", "9814200710", "nirala.alok125@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Amar Das", "B+", "9814890625", "amardas25g@gmail.com", "", "RAC Tripureshwor","( RACT )"));
        bloodGroupClasses.add(new BloodGroupClass("Ambika Sunuwar", "B+", "9840274735", "ambikasunuwar39@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Anamika Koirala", "B+", "9860991920", "aanamika.koirala@gmail.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Anil Pandeya", "B+", "9843283625", "anilpandeya03@gmail.com", "Dhangadhi-05, Hasanpur", "RAC Dhangadhi","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Anish Shakya", "B+", "9805469648", "anishshakya23456@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("Anisha Bhandari", "B+", "9841151444", "anishabhandari13@gmail.com", "kathmandu, Nepal", "RAC Rudramati","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Anisha Neupane", "B+", "9808679948", "anisha12163@gmail.com", "", "RAC Tripureshwor","( RACT )"));
        bloodGroupClasses.add(new BloodGroupClass("Ankit Prasad Jayaswal", "B+", "9817616121", "jayaswakankit9854@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Ankit Raj Bista", "B+", "9803000505", "Ankit.bista@yahoo.com", "", "RAC Bagmati","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Anshu Thapa", "B+", "9808303061", "anshuthp@gmail.com", "Dhumbarahi, Kathmandu", "RAC Kathmandu Metro","( RACKM )"));
        bloodGroupClasses.add(new BloodGroupClass("Anuj Aryal", "B+", "9843057740", "aaryal79@gmail.com", "", "RAC Bagmati","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("ANUJA ACHARYA", "B+", "9843717773", "acharyaanuja@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Anup Gautam", "B+", "9846739814", "anupgautam84@gmail.com", "", "RAC Kathmandu University","( RACKU )"));
        bloodGroupClasses.add(new BloodGroupClass("Anupa Karmacharya", "B+", "9849877159", "anupa9659@gmail.com", "Panauti, Nepal", "RAC Panauti","( RACP )"));
        bloodGroupClasses.add(new BloodGroupClass("ANURAG PANDEY", "B+", "9843849107", "bingo.anurag@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("ANUSKA POKHAREL", "B+", "9849960322", "aanuska.pokharel@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Aradhana Jayaswal", "B+", "9807676072", "annujayaswal07@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Arjun Acharya", "B+", "9857071235", "arjun.acharya@gmail.com", "", "RAC Butwal","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("ARJUN LAMICHHANE", "B+", "9855054347", "arjunlmc54347@gmail.com", "", "RAC Bharatpur","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Arun Yadav", "B+", "9813356776", "arun.yadav5426@gmail.com", "Damak, Nepal", "RAC Damak","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Asha Manohari Jayalath", "B+", "9810214090", "manohariasha@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Ayeshna Amatya", "B+", "9860980272", "ayeshna.amatya@gmail.com", "Patan, Lalitpur", "RAC Yala","( RACY )"));
        bloodGroupClasses.add(new BloodGroupClass("Babu Ram Khanal", "B+", "9844730013", "upendrabaec@gmail.com", "Siddharthanagarpalika-07, Bhairahawa, Rupandehi, Nepal", "RAC Central Lumbini","( RACCL )"));
        bloodGroupClasses.add(new BloodGroupClass("Bandana Rai", "B+", "9816384835", "president.rcjm1819@gmail.com", "", "RAC Jawalakhel Manjushree","( RACJM )"));
        bloodGroupClasses.add(new BloodGroupClass("BARSHA KC", "B+", "9818337113", "kcbarsha2@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Barsha siwakot", "B+", "9823172054", "barshaciwakoti@gmail.com", "FNCSI,Maitighar", "RAC Rudramati- Babarmahal","( RACRB )"));
        bloodGroupClasses.add(new BloodGroupClass("BARSHA YADAV", "B+", "9843496745", "yadav.barsha45@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Bashant Raj Bhatta", "B+", "9848733646", "bhattabashant@gmail.com", "Dhangadhi-05, Hasanpur", "RAC Dhangadhi","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Basu Kandel", "B+", "9845364162", "bashu_kandel2011@yahoo.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Batsala Upreti", "B+", "9861343782", "tabtoenter@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Bhawana Chand", "B+", "9823714117", "vawanachand211@gmail.com", "Rotary Bhawan, Thapathali, Kathmandu", "RAC Kathmandu","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Bhuwan Poudel", "B+", "9816674848", "wansu147@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Bibek neupane", "B+", "9867277283", "neupanebibek38@gmail.com", "Dang, Rapti", "RAC Dang","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Bibika Rai", "B+", "9861517823", "bibikaarai@gmail.com", "Thapagaun, New Baneswor, Kathmandu", "RAC Durbarmarg","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Bidur Aryal", "B+", "9861194774", "bidur.aryal07@gmail.com", "", "RAC Kathmandu University","( RACKU )"));
        bloodGroupClasses.add(new BloodGroupClass("Bikalpa Dhungana", "B+", "9851236760", "bikalpadhungana@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Bikalpa K.c", "B+", "9824169086", "tarabikalpa2073@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Bikash Tamang", "B+", "9813000525", "bkstmg24@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Bindu Gyawali", "B+", "9843214694", "bindugyawali007@gmail.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("Binita Bastola", "B+", "9860573848", "naini.brg@icloud.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Binita katuwal", "B+", "9824304303", "binita.katuwal.44@gmail.com", "Tinpaini, Biratnagar", "RAC Biratnagar Down Town","( RACBDT )"));
        bloodGroupClasses.add(new BloodGroupClass("Binod Adhikari", "B+", "9817217617", "badhikari960@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Binod Uprety", "B+", "9844604999", "upretybnd@gmail.com", "Damak, Nepal", "RAC Damak","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Bintee Koirala", "B+", "9818183955", "bintee18@gmail.com", "Kutumba Cafe, Mahendrapool Pokhara", "RAC Pokhara Mid Town","( RACPMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Bishal Belbase", "B+", "9842771086", "belbasebshal@gmail.com", "", "RAC Kapilvastu","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Bishal Khadka", "B+", "9849137588", "bishal.kh10@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RAVKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Bitusha Paudel", "B+", "9845612461", "paudelb2sha@gmail.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Chakra Bishwakarma", "B+", "9865650986", "bishwakarmachakra@gmail.com", "Dhangadhi-05, Hasanpur", "RAC Dhangadhi","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Chandika Rai", "B+", "9815756270", "chamlingchandika@gmail.com", "Saraswotinagar kapan", " RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Dadhiram Dhakal", "B+", "9815358761", "dhakaldadhi@gmail.com", "Damak, Nepal", "RAC Damak","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Deepa Poudel", "B+", "9843319744", "dddeepappoudel@gmail.com", "kathmandu, Nepal", "RAC Rudramati","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Deepika Subedi", "B+", "9809732460", "deepikqsubedi@gmail.com", "Dang, Rapti", "RAC Dang","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Deepu Parajuli", "B+", "9857071506", "dipu.parajuli@gandakiauto.com.np", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("DHARANA GELAL", "B+", "9860316116", "dharanagelal@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Dharmendra Singh", "B+", "9861898722", "dharmeshthakuri08@gmail.com", "Lohala, Lalitpur", "RAC Patan Durbar Square","( RACPDS )"));
        bloodGroupClasses.add(new BloodGroupClass("Dinesh Budhathoki", "B+", "9860440884", "dineshbudhathoki1002@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Dipa Chaudhary", "B+", "9848672860", "dipachaudhary00@gmail.com", "Dhangadhi-05, Hasanpur", "RAC Dhangadhi","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("DIPAK RAJ PANT", "B+", "9868781702", "drspant77@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Dipika Basnet", "B+", "9800909839", "dipikabasnet135@gmail.com", "Damak, Nepal", "RAC Damak","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Dipika Budathoki", "B+", "9840352377", "dadaldeepika123@gmail.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("Divya Regmi", "B+", "9867302005", "divyaregmi98@gmail.com", "", "RAC Butwal","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Diwash Raj Ghimire", "B+", "9851244848", "diwaaz@gmail.com", "Kutumba Cafe, Mahendrapool Pokhara", "RAC Pokhara Mid Town","( RACPMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Ganesh Karki", "B+", "9847133832", "ganesh26.karki@gmail.com", "", "RAC Kapilvastu Mid-Town","( RACKMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Ganga Subedi", "B+", "9846777474", "gangaasub@gmail.com", "Kutumba Cafe, Mahendrapool Pokhara", "RAC Pokhara Mid Town","( RACPMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Gaurav Khadka", "B+", "9813040493", "gaurav.khadka76@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Gobind Prasad Bhusal", "B+", "9856035093", "govindabhusal93@gmail.com", "Kutumba Cafe, Mahendrapool Pokhara", "RAC Pokhara Mid Town","( RACPMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Gopal Shah", "B+", "9860301252", "shah.royal67@gmail.com", "", "RAC Liberty College","( RACLC )"));
        bloodGroupClasses.add(new BloodGroupClass("Grishman Giri", "B+", "9845597811", "grisman.funboy69@gmail.com", "Ratnanagar-9, Chitwan, Nepal", "RAC Ratnanagar","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Gyapan Babu Acharya", "B+", "9849360555", "akashakiacharya@gmail.com", "Thapagaun, New Baneswor, Kathmandu", "RAC Durbarmarg","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Hari Bdr.B.K", "B+", "9865193402", "hari.safalmotors@gmail.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Hasan Shrestha", "B+", "9841877293", "hasan.12@gmail.com", "Thapagaun, New Baneswor, Kathmandu", "RAC Durbarmarg","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Iresh Maharjan", "B+", "9849888468", "iresh.maharjan@gmail.com", "", "RAC Bagmati","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Isha Karki", "B+", "9843260440", "ishakarki88@gmail.com", "FNCSI,Maitighar", "RAC Rudramati- Babarmahal","( RACRB )"));
        bloodGroupClasses.add(new BloodGroupClass("Janak Pokhrel", "B+", "9814977004", "janakracktmmetro@gmail.com", "Dhumbarahi, Kathmandu", "RAC Kathmandu Metro","( RACKM )"));
        bloodGroupClasses.add(new BloodGroupClass("Jeevan Regmi", "B+", "9848606525", "jvnregmi44@gmail.com", "Dhangadhi-05, Hasanpur", "RAC Dhangadhi","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Juna Sapkota", "B+", "9860463095", "zoonasapkota@gmail.com", "", "RAC Kathmandu University","( RACKU )"));
        bloodGroupClasses.add(new BloodGroupClass("Kabish Napit", "B+", "9841121669", "Kabishnapit11@gmail.com", "", "RAC Bagmati","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Kalyan Poudel", "B+", "9805845294", "Poudelkalyan456@gmail.com", "", "RAC Annapurna","( RACA )"));
        bloodGroupClasses.add(new BloodGroupClass("Keshab Poudel", "B+", "9856082860", "caseofp@gmail.com", "Kutumba Cafe, Mahendrapool Pokhara", "RAC Pokhara Mid Town","( RACPMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Kiran Paudel", "B+", "9861588817", "kiranpaudel59@gmail.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("Kiran Tiwari", "B+", "9861600049", "kiran47455@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Komal Budhathoki", "B+", "9846934996", "Comalbudhathoki@gmail.com", "butwal devinagar", "RAC Butwal South","( RACBS )"));
        bloodGroupClasses.add(new BloodGroupClass("Kripa Gurung", "B+", "9869296514", "creepa.tamusyo@gmail.com", "Thapagaun, New Baneswor, Kathmandu", "RAC Durbarmarg","( RACD )"));

        //B- Blood Group List
        bloodGroupClasses.add(new BloodGroupClass("AMAN BUDHATHOKI", "B-", "9807103299", "amanbudhathoki04@gmail.com", "", "RAC Bharatpur","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Anshu Yadav", "B-", "9802005270", "Yanshu038@gmail.com", "", "RAC Tripureshwor","( RACT )"));
        bloodGroupClasses.add(new BloodGroupClass("Bishwa Raj Poudel", "B-", "9847315288", "beingbishwa@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("DIPAK KANDEL", "B-", "9855056574", "kandeldipak460@gmail.com", "", "RAC Bharatpur","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("LAXMAN TIMILSINA", "B-", "9817170582", "meroconvaas@gmail.com", "", "RAC Bharatpur","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Nirmal Poudel", "B-", "9860081767", "nirmalpoudel2054328@gmail.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("Prakriti Pahari", "B-", "9846469528", "savenature093@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Ria Belbase", "B-", "9842693150", "balbaserita50@gmail.com", "", "RAC Kapilvastu","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Sarita Acharya", "B-", "9869093793", "Sarita.acharya53@gmail.com", "", "RAC Pokhara GMC","( RACPGMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Bindu Ojha", "B-", "9842355728", "Krishnasaisa73@gmail.com", "", "RAC Biratnagar","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Pardeep Gyawali", "B-", "9847011804", "upendrabaec@gmail.com", "Siddharthanagarpalika-07, Bhairahawa, Rupandehi, Nepal", "RAC Central Lumbini","( RACL )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Ashish Kumar Thapa", "B-", "9846279033", "aacs0624@gmail.com", "Pokhara Lekhnath-9, Kaski", "RAC Pokhara","( RACP)"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Ayushma Acharya", "B-", "9843027234", "happypumpkin95@gmail.com", "Kathmandu Medical College 184 Baburam Acharya Sadak, Sinamangal, Kathmandu, Nepal.", "RAC Kathmandu Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Bhojraj Lamsal", "B-", "9868691906", "lamsalbhojraj1997@gmail.com", "", "RAC Chitwan","( RACC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Dinesh Agrawal", "B-", "9857012135", "dineshagr009@gmail.com", "Siddharthanagar -08 , Bhairahawa Rupandehi, Nepal", "RAC Lumbini Siddhartha Nagar","( RACLSN )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Dipu Barnawal", "B-", "9821258877", "dipu04434@gmail.com", "besides narayani hospital", "RAC Birgunj","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Gyan Bahadur Thapa", "B-", "9804451036", "addemail@please.com", "", "RAC Butwal Down Town","( RACBDT )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Janavi Jha", "B-", "9843688590", "Janavijha98@gmail.com", "Kathmandu Medical College 184 Baburam Acharya Sadak, Sinamangal, Kathmandu, Nepal.", "RAC Kathmandu Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Kalpana Bhusal", "B-", "9811970241", "Kalpanabhusal770@gmail.com", "Devdaha, Rupandehi Nepal", "RAC Tilottama Devdaha","( RACTD )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Mitra khatri", "B-", "9860255370", "mitrakhatri73@gmail.com", "Kathmandu,Nepal", "RAC Rajdhani","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Nirmal Pandey", "B-", "9845330601", "addemail@please.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Nutan Thapa", "B-", "985115824", "nutan.thapa@ebl.com.np", "Tinpaini, Biratnagar", "RAC Biratnagar Down Town","( RACBDT )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Pitamber Adhikari", "B-", "9855064563", "smile.foru2003@gmail.com", "", "RAC Bharatpur","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Prakash Karn", "B-", "9845216824", "prakashhh321@gmail.com", "Maisthan, Birgunj", "RAC Birgunj Metropolis","( RACBM )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Rahul Kasaudhan", "B-", "9857058177", "r9857058177@gmail.com", "", "RAC Central Butwal","( RACCB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Raj Shikhar Tanduar", "B-", "9851023225", "rkaulzit@gmail.com", "", "RAC Himalaya Patan","( RACHP )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Rhitik Bista", "B-", "9810530256", "Rhitik1119@gmail.com", "Kathmandu Medical College 184 Baburam Acharya Sadak, Sinamangal, Kathmandu, Nepal.", "RAC Kathmandu Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Sachitanand Prasad Chaudhary", "B-", "9845601725", "spchaudhary321@gmail.com", "", "RAC Kathmandu Mid Town","( RACKMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Sagar Lohani", "B-", "+61450609186", "findsagar01@gmail.com", "vyas 02 damauli tanahun", "RAC Damauli","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Sunil Karki", "B-", "9842330370", "sunil.karki625@gmail.com", "", "RAC Biratnagar","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Sabina Sapkota", "B-", "9843503406", "elecengsab@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Samjhana Timsina", "B-", "9846946947", "samjhana.timsina7777@gmail.com", "Kutumba Cafe, Mahendrapool Pokhara", "RAC Pokhara Mid Town","( RACPMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Upendra Yadav", "B-", "9867023355", "upendrabaec@gmail.com", "Siddharthanagarpalika-07, Bhairahawa, Rupandehi, Nepal", "RAC Central Lumbini","( RACCL )"));


        //O+ Blood Group List
        bloodGroupClasses.add(new BloodGroupClass("Aanshutosh Shrestha", "O+", "9841863905", "aanshu_cool@yahoo.com", "", "RAC Balaju","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("AAROGYA KHANAL", "O+", "9860903822", "aarogyajones1@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("AASHIKA NEUPANE", "O+", "9845906441", "anujaneupane088@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("AASHISH PANDEY", "O+", "9846561118", "apandey.gbs23@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("AASTHA KATUWAL", "O+", "9860161930", "ktwlaastha@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Aayush Dhital", "O+", "9843572377", "aayushdhital09@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("AAYUSHA OJHA", "O+", "9861355134", "aayushaojha07@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Aayusha Shrestha", "O+", "9808786563", "aayusha2014@gmail.com", "", "RAC New Road City","( RACNRC )"));
        bloodGroupClasses.add(new BloodGroupClass("ADARSH GURUNG", "O+", "9849391859", "adarshgurung918@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Adish Ghimire", "O+", "9843413226", "adhish271@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Alexa Rajbhandari", "O+", "9823611326", "axelarajbhandari@gmail.com", "Patan, Lalitpur", "RAC Yala","( RACY )"));
        bloodGroupClasses.add(new BloodGroupClass("Alisha Aryal", "O+", "9845902284", "alishaaryal.92@gmail.com", "Ratnanagar-9, Chitwan, Nepal", "RAC Ratnanagar","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("AMAN NEUPANE", "O+", "9855059374", "amanneupane.an@gmail.com", "", "RAC Bharatpur","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Amir Shrestha", "O+", "9860868529", "amirshtestha742@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Ammar Anver", "O+", "9806671592", "anverammar@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Angel Chamling", "O+", "9813904041", "anzeela.rye123@gmail.com", "Thapagaun, New Baneswor, Kathmandu", "RAC Durbarmarg","( RACD)"));
        bloodGroupClasses.add(new BloodGroupClass("Anil Bhusal", "O+", "9847229846", "anilbhusal6@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Anil Lamichhane", "O+", "9856011744", "rtranillamichhane@gmail.com", "Kutumba Cafe, Mahendrapool Pokhara", "RAC Pokhara Mid Town","( RACPMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Anil Subedi", "O+", "9846363023", "anilsubedi@gmail.com", "Kushma, Parbat", "RAC Parbat","( RACP )"));
        bloodGroupClasses.add(new BloodGroupClass("Anima Acharya", "O+", "9861292483", "secretary.rcjm1819@gmail.com", "", "RAC Jawalakhel Manjushree","( RACJM )"));
        bloodGroupClasses.add(new BloodGroupClass("Anish Baral", "O+", "9845343608", "anishbaral001@gmail.com", "Ratnanagar-9, Chitwan, Nepal", "RAC Ratnanagar","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Anisha Acharya", "O+", "9842506819", "anishaacharya1122@gmail.com", "", "RAC Hetauda","( RACH )"));
        bloodGroupClasses.add(new BloodGroupClass("Anisha Adhikari", "O+", "9806624293", "anisha293@gmail.com", "vyas 02 damauli tanahun", "RAC Damauli","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Anisha Tiwari", "O+", "9845736088", "anishatiwari23@yahoo.com", "Ratnanagar-9, Chitwan, Nepal", "RAC Ratnanagar","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Anjila Gurung", "O+", "9806724501", "angeelaggurung@gmail.com", "", "RAC Annapurna","( RACA )"));
        bloodGroupClasses.add(new BloodGroupClass("Anju Ghimire", "O+", "9846863593", "ghimireanju416@gmail.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Ankit Chaudhary", "O+", "9818545674", "cankit456@gmail.com", "Thapagaun, New Baneswor, Kathmandu", "RAC Durbarmarg","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Anmol Lamichhane", "O+", "9813392908", "priclesslamichhane@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("ANU ADHIKARI", "O+", "9860999209", "anuadhikari365@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Anu Paudel", "O+", "9846177229", "itsmeanu3@gmail.com", "Rotary Bhawan, Thapathali, Kathmandu", "RAC Kathmandu","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Anuja Shrestha", "O+", "9808912155", "anujastha10@gmail.com", "", "RAC Balaju","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Aparna Paudel", "O+", "9841203157", "paudelaparna@gmail.com", "", "RAC Kathmandu University","( RACKU )"));
        bloodGroupClasses.add(new BloodGroupClass("Apeksha Jain", "O+", "9826197802", "jain.apeksha.gr8@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Arasi Amatya", "O+", "9840341168", "amatyaarasi@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Archana Pokhrel", "O+", "9803209389", "archanapokharel.ap@gmail.com", "Lohala, Lalitpur", "RAC Patan Durbar Square","( RACPDS )"));
        bloodGroupClasses.add(new BloodGroupClass("Arika Shrestha", "O+", "9844655678", "arikashrestha62@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Arun Kharel", "O+", "9843150437", "arunkharel1993@gmail.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("Ashesh Shrestha", "O+", "9849663093", "inertashesh@gmail.com", "Dhumbarahi, Kathmandu", "RAC Kathmandu Metro","( RACKM )"));
        bloodGroupClasses.add(new BloodGroupClass("Ashim Khanal", "O+", "9867404334", "ashimkhanal@gmail.com", "", "RAC Butwal","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("ASHIRBAD ACHARYA", "O+", "9840055353", "ashirbad99@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Ashish Poudel", "O+", "9842683010", "aasish02@gmail.com", "Birtamod, Jhapa, Nepal", "RAC Birtamod Mid-Town","( RACBMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Ashmit Bhandar", "O+", "9867300071", "Ashmitbhandari23@gmail.com", "Devdaha, Rupandehi Nepal ", "RAC Tilottama Devdaha","( RACTD )"));
        bloodGroupClasses.add(new BloodGroupClass("Ashmita Gautam", "O+", "9849791812", "dreamnachievea@gmail.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("Ashok Bhattarai", "O+", "9807532809", "ashok.kshttri@yahoo.com", "", "RAC Butwal","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Asmita Bhusal", "O+", "9843318895", "asmita.bhusal10@gmail.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("Asok Kuwar", "O+", "9867504898", "kuwarashok@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("ASWIN GAUTAM", "O+", "9861741929", "redhairedaswin59@gmail.com", "", "RAC Bharatpur","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Aswin Shahi", "O+", "9849138022", "aswin.shahi@gmail.com", "", "RAC New Road City","( RACNRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Avash Rijal", "O+", "9843450890", "avashrijal2007@gmail.com", "", "RAC Tripureshwor","( RACT )"));
        bloodGroupClasses.add(new BloodGroupClass("AYUSH ADHIKARI", "O+", "9865005575", "ayush.adh@gmail.com", "", "RAC Bharatpur","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("AYUSHA KATWAL", "O+", "9860920851", "katwalayusha21@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Bamdev Bhandari", "O+", "9856078917", "bamdevb09@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Bandana Shrestha", "O+", "9843483602", "Bandanashrestha0@gmail.com", "", "RAC Bagmati","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("BARSHA KOIRALA", "O+", "9844595090", "koirala.ugly@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Barsha Raut", "O+", "9849134944", "rautbarsha36@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Barun Giri", "O+", "9846345972", "barungiri333@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("BHAWANA SINGH", "O+", "9813881072", "singhbhawana475@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Bhisma Ale", "O+", "9805474321", "alesbhishma@gmail.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Bhupen Pandey", "O+", "9857070224", "bhupenpandey96@gmail.com", "butwal devinagar", "RAC Butwal South","( RACBS )"));
        bloodGroupClasses.add(new BloodGroupClass("Bibash Adhikari", "O+", "9841555972", "bibash1270@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Bibek Jung Karki", "O+", "9863697379", "bibek.karki7379@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("BIbek Manandhar", "O+", "9803566475", "bibek.manandhar2000@gmail.com", "", "RAC Bagmati","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Bikash Gurung", "O+", "9814448970", "bikashgurung12@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("Bikram Singh", "O+", "9847115872", "swikram02@gmail.com", "", "RAC Palpa Tansen","( RACPT )"));
        bloodGroupClasses.add(new BloodGroupClass("Bimal Timilsina", "O+", "9867232628", "timilsina.bml05@gmail.com", "", "RAC Kathmandu University","( RACKU )"));
        bloodGroupClasses.add(new BloodGroupClass("Binita Adhikari", "O+", "9803800633", "bntadhikari@gmail.com", "", "RAC Kathmandu University","( RACKU )"));
        bloodGroupClasses.add(new BloodGroupClass("Binod Chnadra Khanal", "O+", "9857036414", "binchand.khanal@gmail.com", "butwal devinagar", "RAC Butwal South","( RACBS )"));
        bloodGroupClasses.add(new BloodGroupClass("Binod Shrestha", "O+", "9802998455", "stha.binod5213@gmail.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Bipul Panthi", "O+", "9840466625", "panthibipul@gmail.com", "Rotary Bhawan, Thapathali, Kathmandu", "RAC Kathmandu","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Bishal Rana", "O+", "9802671972", "br124776@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("Bishow Poudel", "O+", "9843307090", "bishowpoudel0@gmail.com", "Patan, Lalitpur", "RAC Chandragiri","( RACC )"));
        bloodGroupClasses.add(new BloodGroupClass("Bivek Sharma", "O+", "9867012336", "biveksharma6@gmail.com", "", "RAC Butwal","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Deepa Ghimire", "O+", "9869555743", "ghimiredeepa10@gmail.com", "", "RAC Kathmandu North East","( RACKNE )"));
        bloodGroupClasses.add(new BloodGroupClass("Deepak Aryal", "O+", "9847351701", "deepakaryal119@gmail.com", "", "RAC Butwal","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Deepak Bist", "O+", "9863679644", "deepakbist977@gmail.com", "Dhangadhi-05, Hasanpur", "RAC Dhangadhi","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Deepak ghimire", "O+", "9857014789", "dghimire7@gmail.com", "", "RAC Kapilvastu","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Deepak Kumar Gaire", "O+", "9857036345", "deepakgaire345@gmail.com", "", "RAC Kapilvastu","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Dhakraj Subedi", "O+", "9847809283", "dhakraj51@gmail.com", "Dang, Rapti", "RAC Dang","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Dikshya Khadka", "O+", "9803933492", "dikshyakhadka23@gmail.com", "", "RAC Kathmandu University","( RACKU )"));
        bloodGroupClasses.add(new BloodGroupClass("Dony Gurung", "O+", "9825128850", "donygrg@gmail.com", "Kutumba Cafe, Mahendrapool Pokhara", "RAC Pokhara Mid Town","( RACPMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Durga Rijal", "O+", "9844696547", "durgarijal111@gmail.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("Erina Khatri", "O+", "9867718052", "erinakc5@gmail.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("Ganesh Acharya", "O+", "9845364448", "gacharya311@gmail.com", "Ratnanagar-9, Chitwan, Nepal", "RAC Ratnanagar","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("GANGA SHRESTHA", "O+", "9825126946", "gangastha304@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Garima Rijal", "O+", "9812365522", "rijalgarima5@gmail.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("Govinda Timalsena", "O+", "9826183104", "govindatimalsena7@gmail.com", "vyas 02 damauli tanahun", "RAC Damauli","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Hasna Thapa", "O+", "9845047781", "hasanathapa@gmail.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Hemanth Lamichhane", "O+", "9865388029", "mail.lhemant@gmail.com", "Kutumba Cafe, Mahendrapool Pokhara", "RAC Pokhara Mid Town","( RACPMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Hira Kafle", "O+", "9845711790", "me.hira.kafle@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Hom Bahadur Thapa", "O+", "9816439332", "homthapa001@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Ishor Bhattarai", "O+", "98570399955", "ishor.bhattarai333@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("JASTINA KARKI", "O+", "9841964965", "jastinakarki@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Jennifer Rai", "O+", "9860042122", "jeniferrai26@gmail.com", "Thapagaun, New Baneswor, Kathmandu", "RAC Durbarmarg","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass(" JINISHA MAHARJAN", "O+", "9818605324", "jinishamhrjn2017@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("JYOTI DAHAL", "O+", "9860144168", "jyotidahal@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Kabita Kafle", "O+", "9845517606", "kabitakafle84@gmail.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Kalpana Bhattarai", "O+", "9846922842", "bkalpana230@gmail.com", "Kutumba Cafe, Mahendrapool Pokhara", "RAC Pokhara Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Kamal Giri", "O+", "9849953502", "kamalgiri242@gmail.com", "", "RAC Charumati","( RACC )"));
        bloodGroupClasses.add(new BloodGroupClass("Kamal Gurung", "O+", "9857070972", "ronaldo7_grg@yahoo.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("Kamal Mandal", "O+", "kamalmandalkm555@gmail.com", "", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));

        //O- Blood Group List
        bloodGroupClasses.add(new BloodGroupClass("Aayush Chauhan", "O-", "9861286798", "Aayushchauhan222@gmail.com", "", "RAC Kathmandu University","( RACKU )"));
        bloodGroupClasses.add(new BloodGroupClass("Amrit Tripathi", "O-", "9846717666", "amrittripathi1256@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Anjila Basnet", "O-", "9860810863", "anjila.11basnet@yahoo.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Bishu Thapa", "O-", "9616493816", "Vthapa1128@gmail.com", "", " RAC Annapurna","( RACA )"));
        bloodGroupClasses.add(new BloodGroupClass("Prince Goyal", "O-", "9843659477", "princesslamichhane@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Princy Kharel", "O-", "", "prrincy123@gmail.com", "", "RAC Khitiz Int'l College","( RACKIC )"));
        bloodGroupClasses.add(new BloodGroupClass("Riti Neupane", "O-", "9845654311", "ritineupane1@gmail.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Roshan Chhetri", "O-", "9846613470", "roshanchettri987@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Roshani Khadka", "O-", "9849394957", "roshanikdk5@gmail.com", "FNCSI,Maitighar", "RAC Rudramati- Babarmahal","( RACRB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Harish Dangi", "O-", "9848043398", "harishhappy27@gmail.com", "", "RAC Jawalakhel","( RACJ )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Ansu Thapaliya", "O-", "9845418065", "asu.thapaliya@gmail.com", "", "RAC Kathmandu North","( RACKN )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Arjun karki", "O-", "9810066542", "addemail@please.com", "", "RAC Birtamode","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Barkha Keyal", "O-", "9821228905", "barkhakeyal@gmail.com", "Maisthan, Birgunj", "RAC Birgunj Metropolis","( RACBM )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Bibek Makaju Shrestha", "O-", "9860895801", "makajubibek@gmail.com", "", "RAC Dhulikhel","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Devendra K.C.", "O-", "9857822419", "devendra195@yahoo.com", "Tulsipur-5,Dang", "RAC Tulsipur","( RACT )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Dr. Pritha Adhikari", "O-", "9849909077", "adhikaripritha25@gmail.com", "Kathmandu Medical College 184 Baburam Acharya Sadak, Sinamangal, Kathmandu, Nepal. ", "RAC Kathmandu Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Gunjan Dhakal", "O-", "9857036052", "gunjan.dhakal8@gmail.com", "", "RAC Central Butwal","( RACCB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Kishor Kuikel", "O-", "9843605610", "k.kuikel21@gmail.com", "", "RAC Phulbari","( RACP )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Madan Giri", "O-", "9867015636", "girimadan388@gmail.com", "Butwal, Rupandehi", "RAC Tilottama Rupandehi","( RACTR )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Manoj Raut", "O-", "9856063399", "happymanoj83@gmail.com", "vyas 02 damauli tanahun", "RAC Damauli","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Nischal Subedi", "O-", "9867186628", "nissubedi42@gmail.com", "Kathmandu Medical College 184 Baburam Acharya Sadak, Sinamangal, Kathmandu, Nepal.", "RAC Kathmandu Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Nita Nepal", "O-", "9847450696", "nits_universe@yahoo.com", "", "RAC Butwal","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Prakash Gupta", "O-", "9811880001", "gupta.prakash010@gmail.com", "besides narayani hospital", "RAC Birgunj","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Pramod Aryal", "O-", "9845300332", "pramodaryal123@gmail.com", "Hetauda-2, Makawanpur", "RAC Makwanpur","( RACM )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Pratibha Rimal", "O-", "9843809888", "sristi.rimal@gmail.com", "", "RAC People Campus","( RACPC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Rakshya Pandey", "O-", "9861717321", "rachhufuchhu@gmail.com", "Kathmandu Medical College 184 Baburam Acharya Sadak, Sinamangal, Kathmandu, Nepal.", "RAC Kathmandu Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Roni Shakya", "O-", "9843107330", "roni.shakya321@gmail.com", "", "RAC Charumati","( RACC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Roshan K.C", "O-", "9805288277", "roshankc3131@yahoo.com", "Kushma, Parbat", "RAC Parbat","( RACP )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Rubisha Upreti", "O-", "9844481372", "rubishau@gmail.com", "", "RAC Pashupati","( RACP )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Sandip Paudel", "O-", "9857011047", "sandippaudel1995@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Sanjaya wosti", "O-", "9843591443", "Sanjayawosti72@gmail.com", "", "RAC Rupandehi","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Sauurav Bhusal", "O-", "9857034994", "sauravh.bhusal22@gmail.com", "", "RAC Butwal Down Town","( RACBDT )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Shristi Maharjan", "O-", "9849163469", "secretary1819rackne@gmail.com", "", "RAC Kathmandu North East","( RACKNE )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Shristi Nakarmi", "O-", "9840506366", "shyanglee.nakarmi@gmail.com", "Kathmandu,Nepal", "RAC Rajdhani","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Suraj Bhandari", "O-", "9847528113", "mee.suraj01@gmail.com", "Butwal, Rupandehi", "RAC Tilottama Rupandehi","( RACTR )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr.Sunil Thapa", "O-", "9856087913", "nilpisces.03@gmail.com", "", "RAC Annapurna","( RACA )"));
        bloodGroupClasses.add(new BloodGroupClass("Sakar Shrestha", "O-", "9813112913", "ctha.sakar@gmail.com", "", "RAC Balaju","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Shanti Puri", "O-", "9841615934", "shantipuri8@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("SWARUP TIWARI", "O-", "9840701629", "swaruptw@gmail.com", "", "RAC Bharatpur","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Upakar Poudel", "O-", "9815124213", "upakarpaudel96@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Usha Moktan", "O-", "9810286472", "ushamoktan301@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));


        //AB+ Blood Group List
        bloodGroupClasses.add(new BloodGroupClass("Aaraby Jeyakumar", "AB+", "9825177167", "aaraby1995@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("AASHMA SHRESTHA", "AB+", "9843150213", "aashmashrestha27@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Abhishek Regmi", "AB+", "9845574180", "abhishekregmi001@gmail.com", "", "RAC Hetauda","( RACH )"));
        bloodGroupClasses.add(new BloodGroupClass("Abisha Subedi", "AB+", "9860888520", "abisha.subedee@gmail.com", "", "RAC Kathmandu University","( RACKU )"));
        bloodGroupClasses.add(new BloodGroupClass("Akkshana Rayamajhi", "AB+", "9860076581", "akkshanarayamajhi@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Alpha Rani Shrestha", "AB+", "9860428999", "alpha.pretty@gmail.com", "", "RAC Bagmati","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Anish Timalsina", "AB+", "9843459679", "reddevilrise7@gmail.com", "", "RAC Charumati","( RACC )"));
        bloodGroupClasses.add(new BloodGroupClass("ANUJ SHRESTHA", "AB+", "9860451890", "anujkoju@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("ASMITA UPRETY", "AB+", "9841724066", "uprety.asmita98@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Basanta Sharma Paudel", "AB+", "9849776805", "bsangram007@gmail.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("Bhawana Khadka", "AB+", "9846849383", "dhk20khadka@gmail.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Bijisha Prasain", "AB+", "9861518644", "bijisha.prasain@gmail.com", "", " RAC Tripureshwor","( RACT )"));
        bloodGroupClasses.add(new BloodGroupClass("Biranmol Singh", "AB+", "9818459504", "biranmol.sandhu@yahoo.com", "IOM, Maharajgunj", "RAC Matribhumi Baluwatar IOM","( RACMBIOM )"));
        bloodGroupClasses.add(new BloodGroupClass("Bishal Jaiswal", "AB+", "9860131235", "bishaljaiswal99@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Deepa Ale", "AB+", "9811257658", "deepaale988@gmail.com", "", " RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Eliza Giri", "AB+", "9847339222", "elizagiri53@gmail.com", "", "RAC Kathmandu University","( RACKU )"));
        bloodGroupClasses.add(new BloodGroupClass("JINEE ACHARYA", "AB+", "9810327895", "coolgurl_jinee@hotmail.com", "Mahalaxmi municipality-1 ,Lalitpur", " RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Karan Tamata", "AB+", "9804660427", "tamatakaran1296@gmail.com", "", " RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Krishna Bahadur Thapa", "AB+", "9846952158", "mgrkrrish2053@gmail.com", "", "RAC Annapurna","( RACA )"));
        bloodGroupClasses.add(new BloodGroupClass("Krishna Raj Mehta", "AB+", "9869602686", "krishna6510@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Lasata Maharjan", "AB+", "9843012139", "lasatamaharjan2@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Manish Mahato", "AB+", "9860943234", "ysolta@gmail.com", "Ratnanagar-9, Chitwan, Nepal", "RAC Ratnanagar","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Mariyam Shakya", "AB+", "9818576055", "mariyamshakya114@gmail.com", "", "RAC New Road City","( RACNRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Neha Gurung", "AB+", "9806769065", "nehadun24@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Nischal kafle", "AB+", "9862222132", "nkafle001@gmail.com", "Damak, Nepal", "RAC Damak","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Nistha Neupane", "AB+", "9868616594", "neethaneupane15@gmail.com", "Dang, Rapti", "RAC Dang","( RACD )"));
        bloodGroupClasses.add(new BloodGroupClass("Prabesh Aryal", "AB+", "9845370184", "aryalprabesh51@gmail.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Prabesh Shrestha", "AB+", "9869081795", "prash.stha7@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Prabha Bhujel", "AB+", "9856002333", "prabhabhj@gmail.com", "Pokhara Metropolitian, Ward No. 6, Lakeside", "RAC Pokhara Lakeside","( RACPL )"));
        bloodGroupClasses.add(new BloodGroupClass("Prabha Shrestha", "AB+", "9813041398", "prabhashrestha04@gmail.com", "Saraswotinagar kapan", "RAC Reliance College","( RACRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Prabin Babu Basnet", "AB+", "9845645505", "prabinbasnet555@gmail.com", "Ratnanagar-9, Chitwan, Nepal", "RAC Ratnanagar","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Prajwal Kandel", "AB+", "9823665133", "kandelprajwal@gmail.com", "", "RAC Bagmati","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("PRASNNA BASNET", "AB+", "9810127421", "prasnna.basnet@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("PRAVA KHANAL", "AB+", "9841831796", "pravakhanal53@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", " RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rabin Shrestha", "AB+", "9845230571", "rabinbrj@gmail.com", "besides narayani hospital", "RAC Birgunj","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rajson Shakya", "AB+", "9843743367", "rajsonshakya7@gmail.com", "", "RAC New Road City","( RACNRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Ram Basnet", "AB+", "9801089557", "rambasnet55@gmail.com", "", "RAC Jawalakhel","( RACJ )"));
        bloodGroupClasses.add(new BloodGroupClass("Rashmi Shrestha", "AB+", "9818585727", "rashmishrestha127@gmail.com", "", "RAC Kathmandu University","( RACKU )"));
        bloodGroupClasses.add(new BloodGroupClass("RILESH PRAJAPATI", "AB+", "9818138139", "ryles2018@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rishika lImbu", "AB+", "9842138346", "rishika123@gmail.com", "", "RAC Dharan Ghopa","( RACDG )"));
        bloodGroupClasses.add(new BloodGroupClass("Ritu Maharjan", "AB+", "9818983242", "mhrritu25@gmail.com", "", "RAC New Road City","( RACNRC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rizzbi Buddhacharye", "AB+", "9813413757", "rizzbishakya@gmail.com", "Panauti, Nepal", "RAC Panauti","( RACP )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Liladhar Ojha", "AB+", "9848606006", "Manoj.ojha53@gmail.com", "", "RAC Pokhara GMC","( RACPGMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Pragya Aryal", "AB+", "9843205600", "pragyaaryal88@gmail.com", "", " RAC Pokhara GMC","( RACPGMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Priyanka Baral", "AB+", "9806643030", "Baral.priyanka551@gmail.com", "", "RAC Pokhara GMC","( RACPGMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Abhisek Maharjan", "AB+", "9860547760", "Abhimajan@gmail.com", "", "RAC Metro City","( RACMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Akriti Poudel", "AB+", "9823649081", "akritipoudel123@gmail.com", "", " RAC Dharan Ghopa","( RACDG )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Anu Awal", "AB+", "9860011015", "awal.angel@yahoo.com", "", "RAC Bhaktapur","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Archana Jha", "AB+", "9823627341", " archanajha123@gmail.com", "", "RAC Dharan Ghopa","( RACDG )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Arjun kumar mandal", "AB+", "9813686298", "mandalarjun144@gmail.com", "", "RAC Dharan Ghopa","( RACDG )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Dipendra psd yadav", "AB+", "9807661067", "dipuydv123@gmail.com", "", "RAC Dharan Ghopa","( RACDG )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Kamal Gautam", "AB+", "9856061178", "kamalgautam2594@gmail.com", "", "RAC Lekhnath","( RACL )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Muna Giri", "AB+", "9860613142", " munagiri130@gmail.com", "", " RAC Bhaktapur","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Namasya Basel", "AB+", "9849849019", "namasyaldedivya@gmail.com", "", "RAC Pokhara GMC","( RACPGMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Prakritee Limbu Lawati", "AB+", "9817905315", "prakriteelimbu12@gmail.com", "", "RAC Dharan Ghopa","( RACDG )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Rahul Singh Rana", "AB+", "9811300271", "rahulsinghrana12@gmail.com", "", "RAC Dharan Ghopa","( RACDG )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr sameer Pantha", "AB+", "9847217630", "sameerpantha@gmail.com", "Siddharthanagarpalika-07, Bhairahawa, Rupandehi, Nepal", "RAC Central Lumbini","( RACCL )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Sapana Roka", "AB+", "9821345262", "rokasapana380@gmail.com", "Baglung Municipality", "RAC Baglung","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Susmita Timalsina", "AB+", "9803803396", "Susmitatimalsina154@gmail.com", "", "RAC Metro City","( RACMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr Urmila Dewan", "AB+", "9842507708", "", "dewanurmila14@gmail.com", "RAC Dharan Ghopa","( RACDG )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Dr. Rimesh Subedi", "AB+", "9851045019", "rimesh.subedi@outlook.com", "Kathmandu Medical College 184 Baburam Acharya Sadak, Sinamangal, Kathmandu, Nepal.", "RAC Kathmandu Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Dr.PUSHPA GYAWALI", "AB+", "9843527785", "pushpagyawalee@gmail.com", "", "RAC Kantipur Dental College","( RACKDC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Laxman Pokhrel", "AB+", "9857058380", "laxmanpokhrel43@gmail.com", "Rotary Secretariat Hillpark, Butwal", "RAC Butwal Synergy","( RACBS )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Aakriti Sharma", "AB+", "9844782756", "aakriti. pandey31@gmail.com", "Rotary Bhawan, Thapathali, Kathmandu", "RAC Kathmandu","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Aashish Neupane", "AB+", "9843343195", "aashneup@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Aasish Joshi", "AB+", "9849516928", "aasish.joshi@yahoo.com", "Patan, Lalitpur", "RAC Yala","( RACY )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Abhin Sapkota", "AB+", "9860420710", "abhin.sapkota@gmail.com", "Kathmandu Medical College 184 Baburam Acharya Sadak, Sinamangal, Kathmandu, Nepal.", "RAC Kathmandu Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Abinash Parajuli", "AB+", "9847239583", "abinash.parajuli94@gmail.com", "", "RAC Manipal College of Medical Sciences","( RACMCMS )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Abisek Kumar Sharma", "AB+", "9849130927", "gyali_abhi@yahoo.com", "", "RAC Dharan Ghopa","( RACDG )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Adhottam Degam Raj Shakya", "AB+", "9851073352", "adegamrs@gmail.com", "", "RAC Banepa","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Alish Shakya", "AB+", "9861111076", "Shakya.alish1@gmail.com", "", "RAC Metro City","( RACMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Alisha Shrestha", "AB+", "9806682166", "alishastha010@gmail.com", "", "RAC Annapurna","( RACA )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Amrit Subedi", "AB+", "9856080939", "amritsubedi_2010@yahoo.com", "Pokhara Lekhnath-9, Kaski", "RAC Pokhara","( RACP )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Anish Ghimire", "AB+", "9857032911", "ghimireanish2047@gmail.com", "Butwal, Nepal", "RAC Ramapithecus","( RACR )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Anish Khadka", "AB+", "9843696224", "samraatanish20@gmail.com", "", "RAC Liberty College","( RACLC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Anish Manandhar", "AB+", "9841146345", "nightcrawler0013@gmail.com", "Bhaisepati", " RAC Sainbu Bhainsepati","( RACSB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Ankit Dubey", "AB+", "9818375804", "ankit19933011@gmail.com", "", "RAC Lalitpur","( RACL )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Ankit Pandey", "AB+", "9867288699", "ankit07.pandey@gmail.com", "Butwal, Rupandehi", "RAC Tilottama Rupandehi","( RACTR )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Anu Baniya", "AB+", "9811576827", "anubaniya12345@gmail.com", "Siddharthanagar -08 , Bhairahawa Rupandehi, Nepal", "RAC Lumbini Siddhartha Nagar","( RACLSN )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Anu Poudel", "AB+", "9842639689", "itsanupoudel@gmail.com", "Birtamod, Jhapa, Nepal", " RAC Birtamod Mid-Town","( RACBMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Anu Wagle", "AB+", "9817274561", "anuwagle56@gmail.com", "", "RAC Narayani Mid Town","( RACNMMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Anuja Gautam", "AB+", "9862059675", "anuja09gautam@gmail.com", "Kathmandu Medical College 184 Baburam Acharya Sadak, Sinamangal, Kathmandu, Nepal.", "RAC Kathmandu Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Anuja Khadka", "AB+", "9860227870", "khadkaanuja01@gmail.com", "Bhaisepati", "RAC Sainbu Bhainsepati","( RACSB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Anukul shrestha", "AB+", "9855063302", "chitwankc@hotmail.com", "", "RAC Chitwan","( RACC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Anushka Shrestha", "AB+", "9813498230", "anushkashrestha30@gmail.com", "", "RAC Kathmandu Mid Town","( RACKMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Anutara Shakya", "AB+", "9841632347", "shakya.anutara@gmail.com", "", "RAC Himalaya Patan","( RACHP )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Arpan Hada", "AB+", "9808729833", "arpanhada@hotmail.com", "Mangalbazar", "RAC Patan West","( RACPW )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Asha karki", "AB+", "9841951779", "smileyasa@hotmail.com", "", "RAC Tripureshwor","( RACT )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Asha Shahi", "AB+", "9862796353", "aashashahi33@gmail.com", "Kathmandu Medical College 184 Baburam Acharya Sadak, Sinamangal, Kathmandu, Nepal.", "RAC Kathmandu Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Ashish K.C", "AB+", "9841822246", "aacis.kaysee@gmail.com", "Madhyapur Thimi", "RAC Madhyapur","( RACM )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Baburam Neupane", "AB+", "9815478904", "baburam026@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Bal Kashi Gurung", "AB+", "9846533879", "rtrbalkashi@gmail.com", "", "RAC Pokhara Fishtail","( RACPF )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Bandana Mahat", "AB+", "9808603495", "mahatbandu2016@gamil.com", "Kathmandu Medical College 184 Baburam Acharya Sadak, Sinamangal, Kathmandu, Nepal.", "RAC Kathmandu Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Bibek Poudel", "AB+", "9847475122", "addemail@please.com", "", "RAC Butwal Down Town","( RACBDT )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Bida Shakya", "AB+", "9814151894", "bishakya54@gmail.com", "", "RAC Pokhara Fishtail","( RACPF )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Bigyan Prajapati", "AB+", "9841764514", "bigyanpra@gmail.com", "Madhyapur Thimi", "RAC Madhyapur","( RACM )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Bijaya Panta", "AB+", "9810237753", "bjpanta007@gmail.com", "Kathmandu Medical College 184 Baburam Acharya Sadak, Sinamangal, Kathmandu, Nepal.", "RAC Kathmandu Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Bikash karki", "AB+", "", "addemail@please.com", "", "RAC Bharatpur","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Bikash Rana", "AB+", "9849098979", "bikashrana3@gmail.com", "", "RAC Kathmandu North East","( RACKNE)"));


        //AB- Blood Group List
        bloodGroupClasses.add(new BloodGroupClass("Grishma Adhikari", "AB-", "9813150254", "grishadk23@gmail.com", "Mahalaxmi municipality-1 ,Lalitpur", "RAC KIST Medical College","( RACKMC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Ahmar Alam", "AB-", "9814434306", "ahmaralam01@gmail.com", "", "RAC Central Butwal","( RACCB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Lomas Shrestha", "AB-", "9845674752", "lomasshrestha11@gmail.com", "", "RAC Narayani Mid Town","( RACNMT )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Pritam bc", "AB-", "", " addemail@please.com", "", "RAC Bharatpur","( RACB )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Saloni Rauniyar", "AB-", "9821237000", "rtrsalonirauniyar@gmail.com", "Maisthan, Birgunj", "RAC Birgunj Metropolis","( RACBM )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Sandip pandey", "AB-", "9847161560", "pandeysubash2047@gmail.com", "", "RAC Tinau City","( RACTC )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Supriya Pyakhurel", "AB-", "9851239483", "ar.supriyapyakurel@gmail.com", "Sanepa, Lalitpur", "RAC Kasthamandap","( RACK )"));
        bloodGroupClasses.add(new BloodGroupClass("Rtr. Sushil Malla", "AB-", "9849622387", "sushil.s.malla@gmail.com", "Kathmandu,Nepal", "RAC Rajdhani","( RACR )"));

    }

    private void buildRecylerView(){
        recyclerView = (RecyclerView) findViewById(R.id.bloodGroupDonorRecyclerView);
        recyclerView.setHasFixedSize(true);
        layoutManager = new LinearLayoutManager(this);
        adapter = new BloodGroupAdapter(bloodGroupClasses);

        recyclerView.setLayoutManager(layoutManager);
        recyclerView.setAdapter(adapter);

    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        if (item.getItemId() == android.R.id.home){
            finish();
        }
        return super.onOptionsItemSelected(item);
    }
}
