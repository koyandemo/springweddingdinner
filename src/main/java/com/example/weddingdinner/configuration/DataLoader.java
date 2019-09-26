package com.example.weddingdinner.configuration;

import com.example.weddingdinner.model.Dinner;
import com.example.weddingdinner.model.Price;
import com.example.weddingdinner.model.RoomFees;
import org.springframework.boot.CommandLineRunner;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Collection;

@Service
public class DataLoader implements CommandLineRunner {


    private MongoTemplate mongoTemplate;

    public DataLoader(MongoTemplate mongoTemplate) {
        this.mongoTemplate = mongoTemplate;
    }

    @Override
    public void run(String... args) throws Exception {

       /* Collection<Dinner> dinners = Arrays.asList(new Dinner("Golden Duck",Arrays.asList("09443163377","01240216"),
                "1/5E Sayar San Road,Yangon",Arrays.asList("Table for 10 people"),new RoomFees(0,0,0,0),new Price(200000,128000,0)),
                new Dinner("Panda Hotel",Arrays.asList("0951212850","0953229358","0953229361"),"No.25,Cornor of Wadan Street & Min Ye Kyaw Swa Road,Lanmadaw Township,Yangon",
                        Arrays.asList("One table has 8 dishes"),new RoomFees(20,30000,0,0),new Price(255000,190000,0)));

*/

        Dinner goldenduck =new Dinner("Golden Duck",Arrays.asList("09443163377","01240216"),
                "1/5E Sayar San Road,Yangon",Arrays.asList("Table for 10 people"),Arrays.asList(""),new RoomFees(0,0,0,0),Arrays.asList(""),new Price(200000,128000,0));

        Dinner pandahotel =  new Dinner("Panda Hotel",Arrays.asList("0951212850","0953229358","0953229361"),"No.25,Cornor of Wadan Street & Min Ye Kyaw Swa Road,Lanmadaw Township,Yangon",
                Arrays.asList("One table has 8 dishes"),Arrays.asList("30000ks for under 20 tables (no room fees for above 20 tables)"),new RoomFees(20,30000,0,0),Arrays.asList(""),new Price(255000,190000,0));


        Dinner hotpotcity = new Dinner("HotPot City",Arrays.asList("09797799111"),
                "No(33),Kyaik Wine Pagoda Road,Yangon",Arrays.asList("Table for 10 people per room"),Arrays.asList("10000ks per hour"),new RoomFees(0,0,1,10000),Arrays.asList("13000 per person"),new Price(13000,120000,1));


        Dinner myGarden = new Dinner("MyGarden",Arrays.asList("09420048037"),
                "Ahlone Road,Infront of Summit Park View Hotel,Inside of People Park Compound,Ahlone", Arrays.asList("60 people per hour +KTV","normal table (6 people per set)","Buffet (above 30 people)")
                ,Arrays.asList("30000 ks per hour"),new RoomFees(0,0,1,30000),  Arrays.asList("normal table (50000 per set)","Buffet(10000/12000 per person"),new Price(12000,10000,1));;




        Collection<Dinner> dinnerCollection =Arrays.asList(goldenduck,pandahotel,hotpotcity,myGarden);
     // this.mongoTemplate.insertAll(dinnerCollection);
     //  this.mongoTemplate.insertAll(dinners);



    }
}
