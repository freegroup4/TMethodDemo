//�t��
public class TMethodDemo{
  public static void main(String args[]){
    int score[]={93,65,78,24,56};//�ŧi�@���}�C
      System.out.println("max="+Arrmethod(score));
  }
  public static int Arrmethod(int arr[]){
    int i,max;
    max=arr[0];
      for(i=0;i<arr.length;i++)
        {
          if (max<arr[i])
            max=arr[i];
        }
        return max;
  }
}
