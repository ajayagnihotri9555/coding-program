import java.util.Scanner;
public class MergeSort {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the no of element:");
        int n=sc.nextInt();
        int[] array=new int[n];
        System.out.println("enter the element:");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();

        }
        mergesort(array,0,n-1);
        System.out.println("sorted array:");
        for(int num : array){
           System.out.println(num+" ");

        }
        sc.close();
    }
    private static void mergesort(int[] array,int left,int right){
        if(left<right){
            int mid=(left+right)/2;
            mergesort(array,left,mid);
            mergesort(array,mid+1,right);
            merge(array,left,mid,right);
        }
    }
    public static void merge(int[] array,int left,int mid,int right){
        int n1=mid-left+1;
        int n2=right-mid;
        int[] leftarray=new int[n1];
        int[] rightarray=new int[n2];
        for(int i=0;i<n1;i++){
            leftarray[i] = array[left+i];

        }
        for(int j=0;j<n2;++j){
            rightarray[j]= array[mid+1+j];
        }
        int i=0,j=0;
        int k=left;
        while(i<n1 && j<n2){
            if(leftarray[i]<=rightarray[j]){
                array[k]=leftarray[i];
                i++;
            }
                else{
                    array[k]=rightarray[j];
                    j++;
                }
                k++;
            }
            while(i<n1){
                array[k]=leftarray[i];
                i++;
                k++;

            }
            while(j<n2){
                array[k]=rightarray[j];
                j++;
                k++;
            }
        }

    }

