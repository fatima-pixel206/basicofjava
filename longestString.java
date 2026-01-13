public class longestString {
    public static void main(String[] args) {
        String[] Name = {"fatima", "alina", "ali", "abid", "latif", "bilal", "saqib", "alishba", "emaan", "akash", "rabia", "mairaj"};

        String name[]= new String[6] ;
        name[0]="fatima";
        name[1]="alina";
        name[2]="ali";
        name[3]="alishba";
        name[4]= "rabia";
        name[5]="farratt";
        String longest=name[0];


        int i=1;
        while(i<name.length){ //loop will run all strings
            //char c = '>';
            if(name[i].length() >longest.length()){// this will compare stings' length
                 longest=name[i];
             //   System.out.println(longest);




            }
            i++;
        //    System.out.println(longest);


        }
        System.out.println(longest);
}
}