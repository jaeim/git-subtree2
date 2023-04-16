package softeer;


import java.util.*;
import java.io.*;
/*
 BufferedReader 안쓰면 틀림!!!!!!!!!!!! (Scanner 보다 월등히 빠르다.)
        String s = br.readLine(); //입력받을값이 String일때
        int a = br.read(); //입력받을값이 int일때
        int b = Integer.parseInt(br.readLine()); //int값+엔터 까지 입력받을때


- 금고털이
    TreeMap을 쓸 경우 같은 가격 or 무게일 경우에 case가 겹쳐진다는 것을 고려 못함..
    즉, TreeMap은 Key값으로만 정렬하기에 Key값이 같으면 Value로 정렬하게 하는것을 구현하지 못해서 틀렸다.
    (사실 더 간단한 방법은 배열쓰는 것.......) 

    ---------------아래 질문글 확인-----------------------
    무게 당 가격이 같은 경우가 있으면 case[P] 가 덮어써지겠네요.

    입력 예제: 
    100 3
    20 1
    30 1
    60 2

    인 경우에는 case 에 {1: 30, 2: 60} 만 남아서 실제 답은 160 이지만, 입력 답은 150이 나올 듯 합니다. 
*/
public class Thief
{
    public static void main(String args[]) throws IOException
    {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int bag_weight = Integer.parseInt(st.nextToken());
        int n = Integer.parseInt(st.nextToken());

        ArrayList<int[]> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            st = new StringTokenizer(br.readLine(), " ");
            int w = Integer.parseInt(st.nextToken());
            int p = Integer.parseInt(st.nextToken());

            list.add(new int[] {w, p});
        }



        Collections.sort(list,(o1,o2)->o2[1]-o1[1]);

        int money = 0;

        for(int[] t: list) {
                
                if (t[0] <= bag_weight) {
                    bag_weight -= t[0];
                    money += t[0] * t[1];
                } else {
                    money += bag_weight * t[1];
                    break;
                }
            
        }
        System.out.println(money);
    }
}