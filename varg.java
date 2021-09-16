class MyMath
{
 public static int sum(int ...arr)   // ... creates reference variable of array object
 {
  int s = 0;
  for(int val : arr )
  {
   s += val;
  }
  return s;
 }
}
class User
{
 public static void main(String args[])
 {
  int res;
  res = MyMath.sum(44,56);System.out.println(res);
   res = MyMath.sum(4,6);System.out.println(res);
    res = MyMath.sum(34,46);System.out.println(res);
 }
}