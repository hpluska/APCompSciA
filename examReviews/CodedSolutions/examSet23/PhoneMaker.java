package examSet23;

public class PhoneMaker {

    public static void main(String args[]){

            /**
             * Number 1b
             */
            //valid because Phone "is a" Object
            Object o = new Phone(317, 555, 1000);

            //invalid because a Phone "is not a" CellPhone
            //CellPhone cp = new Phone(459, 555, 1022);

            //invalid because a CellPhone "is not a" PayPhone
            //PayPhone pph = new CellPhone(333, 555, 4242, 23.423, 54.343);

            //valid because a CellPhone "is a" Phone
            Phone ph = new CellPhone(888, 555, 6642, 78.44, 66.3);

            //valid because PayPhone "is a" Object
            Object o2 = new PayPhone(954, 555, 4242, .25);

            //invalid because the parameters are incorrect
            //PayPhone pph = new PayPhone(123, 555, 5555, 28.44, 45.6);

            /**
             * Number 1c
             */
            Phone ph2 = new CellPhone(444, 555, 6666, 1.2, 2.4);
            String s = ph2.toString();
            System.out.println(s);//444-555-6666; (2.4, 1.2)

            /**
             * Number 1d
             */
            PayPhone pph = new PayPhone(311, 555, 6464, .25);
            Phone ph3 = pph;//valid
            //invalid because insertMoney is not in Phone
            //ph3.insertMoney(.50);

            /**
             * Number 1e
             */
            Phone p = new Phone(765, 999, 1234);
            CellPhone cp = new CellPhone(858, 346, 6430, 40.427437, -86.916979);
            PayPhone pp = new PayPhone(212, 840, 9623, 0.50);

            System.out.println(p instanceof CellPhone);
            //(i)
            System.out.println(p);//765-999-1234
            //(ii)
            System.out.println(cp);//858-346-6430;(-86.916979, 40.427437)
            //(iii)
            System.out.println(pp);//212-840-9623
            //(iv)
            System.out.println(p.makeCall(cp));//Dialing 858-346-6430; (-86.916979, 40.427437)
            //(v)
            System.out.println(cp.makeCall(p));//Dialing 765-999-1234
            //(vi)
            System.out.println(pp.makeCall(p));//Please insert more money to place a call
            //(vii)
            pp.insertMoney(0.50);
            System.out.println(pp.makeCall(p));//Dialing 765-999-1234
            //(viii)
            //ERROR: latitude has private access in CellPhone
            //(ix)
            //System.out.println(cp.latitude);
            System.out.println(cp.getLatitude());//40.427437
            //(x)
            p = cp;
            System.out.println(p);//858 - 346 - 6430; (-86.916979, 40.427437)


    }
}