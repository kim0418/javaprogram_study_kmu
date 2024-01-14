import java.util.*;


public class HashMapScoreEx{
    public static void main(String[] args) {
        HashMap<String,Integer> scoreMap=new HashMap<String,Integer>();

        scoreMap.put("김성동",97);
        scoreMap.put("황기대",88);
        scoreMap.put("김남윤",98);
        scoreMap.put("이재문",70);
        scoreMap.put("한원선",99);
        
        System.out.println("Hashmap : "+scoreMap.size());
        
        Set<String> keys=scoreMap.keySet();
        Iterator<String> it=keys.iterator();
        
        while(true){
            String name = it.next();
            int score = scoreMap.get(name);
            System.out.println(name+":"+score);
        }
    }
}