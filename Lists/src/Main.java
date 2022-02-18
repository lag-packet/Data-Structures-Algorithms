public class Main {

    public static void main(String[] args) {
        LinkedList lnkList = new LinkedList();

        lnkList.add(0,1);
        lnkList.add(1,3);
        lnkList.add(2,4);
        lnkList.add(3,8);
        lnkList.add(4, 3);


        for (int i = 0; i < lnkList.size(); i++) {
            System.out.println(lnkList.get(i));
        }

        lnkList.remove(3);

        System.out.println("-------------");
        for (int i = 0; i < lnkList.size(); i++) {
            System.out.println(lnkList.get(i));
        }
    }
}
