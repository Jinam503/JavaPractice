class Main {
  public static void main(String[] args) {
    String str = "내 이름은 [홍길동]입니다. 나이는 [15]살 입니다";
    String name;
    int age;

    
    int a = str.indexOf("["); // 앞에서부터 "["찾기
    int b = str.indexOf("]");
    name = str.substring(a+1, b);
    a = str.lastIndexOf("["); // 뒤에서부터 "]"찾기
    b = str.lastIndexOf("]");
    age = Integer.parseInt(str.substring(a+1, b));// a+1자리부터 b까지
    
    
    System.out.println(name);
    System.out.println(age);
    
    System.out.println(str.charAt(0)); // 0번째자리
    System.out.println("aaa".concat("ddd"));//aaa에 ddd합치기

    System.out.println(str.replace("홍길동", "김준경")); 
    String x = "JAVA";
    String y = "JAVA";
    String z = "java";
    
    System.out.println(x.equals(y));
    System.out.println(x.equals(z));
    System.out.println(x.equalsIgnoreCase(z));
  }
}