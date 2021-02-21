package com.company;

import java.util.*;

public class Main {
    public static int minIndex(Queue<Integer> list,
                               int sortIndex)
    {
        int min_index = -1;
        int min_value = Integer.MAX_VALUE;
        int s = list.size();
        for (int i = 0; i < s; i++)
        {
            int current = list.peek();

            list.poll();

            if (current <= min_value && i <= sortIndex)
            {
                min_index = i;
                min_value = current;
            }
            list.add(current);
        }
        return min_index;
    }

    public static void insertMinToRear(Queue<Integer> list,
                                       int min_index)
    {
        int min_value = 0;
        int s = list.size();
        for (int i = 0; i < s; i++)
        {
            int current = list.peek();
            list.poll();
            if (i != min_index)
                list.add(current);
            else
                min_value = current;
        }
        list.add(min_value);
    }

    public static void sortQueue(Queue<Integer> list)
    {
        for(int i = 1; i <= list.size(); i++)
        {
            int min_index = minIndex(list,list.size() - i);
            insertMinToRear(list, min_index);
        }
    }

    public static void main(String[] args) {
        //**************** Task #1 ******************
        //Patient
        int i = 0;
        Queue <Patient> queue = new LinkedList<>();
        queue.add(new Patient("Petrov"));
        queue.add(new Patient("Ivanova"));
        queue.add(new Patient("Sidorov"));
        queue.add(new Patient("Smit"));
        queue.add(new Patient("Ferrer"));
        queue.add(new Patient("Mihailova"));
        queue.add(new Patient("Sergeeva"));
        queue.add(new Patient("Homov"));
        queue.add(new Patient("Kobylka"));
        queue.add(new Patient("Smirnof"));

        while (queue.peek() != null) {
            i++;
            queue.remove();
            if(queue.peek() == null) {
                System.out.println("It's cancel the line");
                System.out.println("\n###################################################\n");
                break;
            }
            if(i == 2) {
                ((LinkedList<Patient>) queue).removeLast();
                i = 0;
            }
            System.out.println(queue.toString());
        }

        //Race

        Queue<Race>queueList = new LinkedList<>();
        queueList.add(new Race(99));
        queueList.add(new Race(3));
        queueList.add(new Race(53));
        queueList.add(new Race(35));
        queueList.add(new Race(75));
        queueList.add(new Race(47));
        queueList.add(new Race(63));
        queueList.add(new Race(9));
        queueList.add(new Race(16));
        queueList.add(new Race(1));
        queueList.add(new Race(959));
        queueList.add(new Race(21));

        System.out.println(queueList.toString());

        Queue<Integer>races = new LinkedList<Integer>();
        for(Race race : queueList) {
            races.add(Integer.valueOf(race.toString()));
        }

        sortQueue(races);
        System.out.println(races);
        while (!( races).isEmpty()) {
        System.out.println("The last element is removed: " + ((LinkedList<Integer>) races).removeLast());
        }
        System.out.println("\n###################################################\n");


        //***************** Task #2 *************************


        List<Integer>list = new LinkedList<>();
        int y = 0;
        int x = 10;
        System.out.println("Create");
        while (list.size()<= x) {
            if(y % 2 == 0) {
                ((LinkedList<Integer>) list).addFirst(y);
                System.out.println(list);
            }else {
            ((LinkedList<Integer>) list).addLast(y);
                System.out.println(list);
           }
            y++;
        }
        System.out.println(list);

        System.out.println("Delete");
        while (!(list.size() == 0)) {
            if(y % 2 == 0) {
                ((LinkedList<Integer>) list).removeFirst();
                System.out.println(list);
            }else {
                ((LinkedList<Integer>) list).removeLast();
                System.out.println(list);
            }
        }
        //System.out.println(list);

        System.out.println("\n###################################################\n");


        // Jenga
        List<Integer> integerList = new LinkedList<>();
        integerList.add(1);
        integerList.add(2);
        integerList.add(3);
        integerList.add(4);
        integerList.add(5);
        integerList.add(6);
        integerList.add(7);
        integerList.add(8);
        System.out.println(integerList);
        while (!integerList.isEmpty()) {
            integerList.remove(integerList.get(integerList.size()/2));
            System.out.println(integerList);
        }

        System.out.println("\n###################################################\n");

        //***************** Task #3 *************************


        int  numberOfCards = 10;
        Set<CreditCard> creditCards = new HashSet<>();
        for (int j = 0; j < numberOfCards; j++) {
            creditCards.add(new CreditCard(new Random().nextInt(1000000000)));
        }
        System.out.println(creditCards.toString());

        System.out.println("\n###################################################\n");


        //***************** Task #4 *************************


        Map<String, String> stringMap = new HashMap<>();
        stringMap.put("Alligator", "Alex Smith");
        stringMap.put("Berry", "Liz Cope");
        stringMap.put("Berry89", "Kate Hudson");

        SocialMedia socialMedia = new SocialMedia(stringMap);
        System.out.println(socialMedia.toString());

        System.out.println("REGISTREAT");
        System.out.println("Please enter nickname: ");

        socialMedia.registratorNewUser("Berry", "Lia Lun");
        System.out.println("\n" + socialMedia.toString());

        socialMedia.registratorNewUser("Sunrise", "Lia Lun");
        System.out.println("\n" + socialMedia.toString());

        System.out.println("DELETE ACCOUNT");
        System.out.println("Please enter nickname: ");
        socialMedia.removeUser("Bery");
        System.out.println("\n" + socialMedia.toString());
        socialMedia.removeUser("Berry");
        System.out.println("\n" + socialMedia.toString());
     }
}
