package Task1;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        ArrayList<mutual_fund> mflist=new ArrayList<>();
        mutual_fund mf1=new mutual_fund(1,1345);
        mutual_fund mf2=new mutual_fund(2,1399);
        mutual_fund mf3=new mutual_fund(3,1455);

        mflist.add(mf1);
        mflist.add(mf2);
        mflist.add(mf3);


        ArrayList<FixedDeposite> fdList=new ArrayList<>();
        FixedDeposite fd=new FixedDeposite(1,300);
        FixedDeposite fd1=new FixedDeposite(2,344);
        FixedDeposite fd2=new FixedDeposite(3,450);

        fdList.add(fd);
        fdList.add(fd1);
        fdList.add(fd2);

        ArrayList<Insurance> insuranceList=new ArrayList<>();
        Insurance i=new Insurance(1,123,"Health");
        Insurance i1=new Insurance(2,144,"vehicle");
        Insurance i2=new Insurance(3,154,"life");

        insuranceList.add(i);
        insuranceList.add(i1);
        insuranceList.add(i2);

        HashMap<Integer,ArrayList> map=new HashMap<Integer, ArrayList>();
        map.put(1,mflist);
        map.put(2,fdList);
        map.put(3,insuranceList);



        for(int j=1;j <=3 ; j++){
            System.out.println(j+":"+map.get(j)+"\n");
        }








    }



}
