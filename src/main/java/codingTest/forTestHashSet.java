package codingTest;

import java.util.HashSet;

public class forTestHashSet {
    public static void main(String[] args) {
        HashSet<Integer> hashSet = new HashSet<>();
        HashSet<Integer> hashSet2 = new HashSet<>();

//요소 추가
        hashSet.add(1);

//요소 삭제
        hashSet.remove(1);    // 값이 1인 요소 삭제

//차집합
        hashSet.removeAll(hashSet2);    //hashSet의 데이터 중 hashSet2과 중복된 데이터를 모두 삭제

//교집합
        hashSet.retainAll(hashSet2);    //hashSet의 데이터 중 hashSet2과 중복된 데이터만 남기고 나머지 모두 삭제

//데이터 초기화
        hashSet.clear();

//hashSet 사이즈 확인
        hashSet.size();

//특정 요소 포함 여부 확인
        hashSet.contains(1);

//요소 전체 출력
//Iterator 사용
        Iterator tempIterator = hashSet.iterator();
        while (tempIterator.hasNext()){
            System.out.pringln(tempIterator.next());
        }

//for-each문 사용
        for (String item : hashSet){
            System.out.println(item);
        }
    }
}
