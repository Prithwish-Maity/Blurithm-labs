import java .io.*;
 public class GAME
{
     public static void main(String args[])throws IOException
     {
        InputStreamReader x=new InputStreamReader (System.in);
        BufferedReader y=new BufferedReader (x);
        int a,ans1,ans2,ans3,ans4,ans5,ans6,ans7,ans8,ans9,ans10,ans11,ans12,ans13,ans14,ans15,ans16,ans17,ans18,ans19,ans20,ans21,ans22,ans23,ans24,ans25,ans26,ans27,ans28,ans29,ans30;
        String name;
        System.out.println("What's your name?");
        name=(y.readLine());
        System.out.println("Hello! "+name);
        System.out.print("Thanks for talking with me "+name);
        System.out.println(" ,you can play quiz with me, and by the way my name is quizo.");
        System.out.println("if you want to play quiz with me type 1.");
        a=Integer.parseInt(y.readLine());
        if (a>0 && a<2)
        System.out.println("Quiz is starting................");
        System.out.println("Quiz is starting................");
        System.out.println("Quiz is starting................");
        System.out.println("Quiz is starting................");
        System.out.println("Name the largest country in the world");
        System.out.println("1) Russia");
        System.out.println("2) India");
        System.out.println("3) USA");
        System.out.println("4) Australia");
        ans1=Integer.parseInt(y.readLine());
         if (ans1>0 && ans1<2)
        System.out.println("Correct");
         else System.out.print(ans1+" is the wrong answer. The right answer is 1");
         System.out.println("                                         ");
         System.out.println("                                         ");
         System.out.println("Which of the foods' do you like the most?");
         System.out.println("1) Chicken Momo");
         System.out.println("2) Veg Momo");
         System.out.println("3) Fried Chicken leg Piece");
         System.out.println("4) Paneer Butter Masala");
         ans2=Integer.parseInt(y.readLine());
         if (ans2>0 && ans2<5)
        System.out.println("OMG! it is a very delicious food. Your choice is great");
        else System.out.println(ans2+" is not present in the options. No problem let's move on to our next question.");
         System.out.println("                                         ");
         System.out.println("                                         ");
         System.out.println("Which game from the given options do you play? If you do not play any of the given games then type 0 and if you play all the games from the given ");
         System.out.println("options, then type 100");
         System.out.println("1) PUBG");
         System.out.println("2) FreeFire");
         System.out.println("3) Clash Of Clans");
         System.out.println("4) Minecraft (if you want to download minecraft java edition for free, go to this website- tlauncher.org");
         ans3=Integer.parseInt(y.readLine());
         if (ans3>0 && ans3<5)
        System.out.println("That's a great game! Me too play that game");
        else if (ans3>-1 && ans3<1)
       System.out.println("Ok no problem. Lets move on to our next question");
       else if (ans3>99 && ans3<101)
       System.out.println("Woh! that's great, me too play all the games from this list");
       System.out.println("                                         ");
         System.out.println("                                         ");
         System.out.println("Which of these cities is known as the city of joy?");
         System.out.println("1) London");
         System.out.println("2) Chicago");
         System.out.println("3) Las vegas");
         System.out.println("4) Kolkata");
         ans4=Integer.parseInt(y.readLine());
         if (ans4>3 && ans4<5)
        System.out.println("Correct");
        else if (ans4<1 && ans4>4)
       System.out.println(ans4+" is not present in the options");
       else System.out.println(ans4+" is the wrong answer. The correct answer is option number 4");
       System.out.println("                                         ");
         System.out.println("                                         ");
         System.out.println("Who fought the 'Battle of Haldighati' against Mughal Badshah Akbar?");
         System.out.println("1) Rana Sanga");
         System.out.println("2) Rao Maldev Rathore");
         System.out.println("3) Alexander the Great");
         System.out.println("4) Legendary Maharana Pratap");
         ans5=Integer.parseInt(y.readLine());
         if (ans5>3 && ans5<5)
        System.out.println("Correct");
        else if (ans5<1 && ans5>4)
       System.out.println(ans5+" is not present in the options");
       else System.out.println(ans5+" is the wrong answer. The correct answer is option number 4");
       System.out.println("                                         ");
         System.out.println("                                         ");
         System.out.println("The game Gta 5 is based on which city?");
         System.out.println("1) Las vegas");
         System.out.println("2) Washington D.C.");
         System.out.println("3) Los Angeles");
         System.out.println("4) Kolkata");
         ans6=Integer.parseInt(y.readLine());
         if (ans6>2 && ans6<4)
        System.out.println("Correct");
        else if (ans6<1 && ans6>4)
       System.out.println(ans6+" is not present in the options");
       else System.out.println(ans6+" is the wrong answer. The correct answer is option number 3");
       System.out.println("                                         ");
         System.out.println("                                         ");
         System.out.println("Name the largest city in the world");
         System.out.println("1) Tokyo");
         System.out.println("2) Mumbai");
         System.out.println("3) New York City");
         System.out.println("4) Auckland");
         ans7=Integer.parseInt(y.readLine());
         if (ans7>0 && ans7<2)
        System.out.println("Correct");
        else if (ans7<1 && ans7>4)
       System.out.println(ans7+" is not present in the options");
       else System.out.println(ans7+" is the wrong answer. The correct answer is option number 1");
       System.out.println("                                         ");
         System.out.println("                                         ");
         System.out.println("Which city is known as the millionaires' city?");
         System.out.println("1) Tokyo");
         System.out.println("2) Mumbai");
         System.out.println("3) New York City");
         System.out.println("4) Auckland");
         ans8=Integer.parseInt(y.readLine());
         if (ans8>1 && ans8<3)
        System.out.println("Correct");
        else if (ans8<1 && ans8>4)
       System.out.println(ans8+" is not present in the options");
       else System.out.println(ans8+" is the wrong answer. The correct answer is option number 2");
       System.out.println("                                         ");
         System.out.println("                                         ");
         System.out.println("Which of the given options is the Capital city of India?");
         System.out.println("1) Kolkata");
         System.out.println("2) Mumbai");
         System.out.println("3) Chennai");
         System.out.println("4) Delhi");
         ans9=Integer.parseInt(y.readLine());
         if (ans9>3 && ans9<5)
        System.out.println("Correct");
        else if (ans9<1 && ans9>4)
       System.out.println(ans9+" is not present in the options");
       else System.out.println(ans9+" is the wrong answer. The correct answer is option number 4");
       System.out.println("                                         ");
         System.out.println("                                         ");
         System.out.println("Which of the given options is the old capital of India?");
         System.out.println("1) Mumbai");
         System.out.println("2) Kolkata");
         System.out.println("3) New York City");
         System.out.println("4) Auckland");
         ans10=Integer.parseInt(y.readLine());
         if (ans10>1 && ans10<3)
        System.out.println("Correct");
        else if (ans10<1 && ans10>4)
       System.out.println(ans10+" is not present in the options");
       else System.out.println(ans10+" is the wrong answer. The correct answer is option number 2");
       System.out.println("                                         ");
         System.out.println("                                         ");
         System.out.println("When was last FIFA WORLD CUP held");
         System.out.println("1) 2018");
         System.out.println("2) 2020");
         System.out.println("3) 2016");
         System.out.println("4) 2017");
         ans11=Integer.parseInt(y.readLine());
         if (ans11>0 && ans11<2)
        System.out.println("Correct");
        else if (ans11<1 && ans11>4)
       System.out.println(ans11+" is not present in the options");
       else System.out.println(ans11+" is the wrong answer. The correct answer is option number 1");
       System.out.println("                                         ");
         System.out.println("                                         ");
         System.out.println("Which of the given options is the Economic capital of India?");
         System.out.println("1) Mumbai");
         System.out.println("2) Kolkata");
         System.out.println("3) New York City");
         System.out.println("4) Auckland");
         ans12=Integer.parseInt(y.readLine());
         if (ans12>0 && ans12<2)
        System.out.println("Correct");
        else if (ans12<1 && ans12>4)
       System.out.println(ans12+" is not present in the options");
       else System.out.println(ans12+" is the wrong answer. The correct answer is option number 1");
       System.out.println("                                         ");
         System.out.println("                                         ");
         System.out.println("Which of the given options is the Cultural capital of India?");
         System.out.println("1) Mumbai");
         System.out.println("2) Kolkata");
         System.out.println("3) New York City");
         System.out.println("4) Auckland");
         ans13=Integer.parseInt(y.readLine());
         if (ans13>1 && ans13<3)
        System.out.println("Correct");
        else if (ans13<1 && ans13>4)
       System.out.println(ans13+" is not present in the options");
       else System.out.println(ans13+" is the wrong answer. The correct answer is option number 2");
       System.out.println("                                         ");
         System.out.println("                                         ");
         System.out.println("India is the");
         System.out.println("1) 6th largest country in the world");
         System.out.println("2) 8th largest country in the world");
         System.out.println("3) 10th largest country in the world");
         System.out.println("4) 7th largest country in the world");
         ans14=Integer.parseInt(y.readLine());
         if (ans14>3 && ans14<5)
        System.out.println("Correct");
        else if (ans14<1 && ans14>4)
       System.out.println(ans14+" is not present in the options");
       else System.out.println(ans14+" is the wrong answer. The correct answer is option number 4");
     }
}
