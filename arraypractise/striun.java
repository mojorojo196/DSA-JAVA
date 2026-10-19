package arraypractise;

import java.util.Arrays;

public class striun {
    public static void main(String[] args) {
        int a[]={1,2,3,4,5};
        int b[]={1,6,2,7};
        System.out.println();

       
        }

        public int[] union(int nums1[],int nums2[]){
            int n1=nums1.length;
        int n2=nums2.length;
        int a[]=new int[n1+n2];
        int k=0;

        int i=0;
        int j=0;
        while(i<n1 && j<n2)
        {
            if(nums1[i]==nums2[j]){
                a[k]=nums1[i];
                i++;
                j++;
                k++;
            }
            else if(nums1[i]>nums2[j]){
                    a[k]=nums2[j];
                    j++;
                    k++;
                }
            else{
                    a[k]=nums1[i];
                    k++;
                    i++;
                }
            }

            while(i<n1)
            {
                a[k]=nums1[i];
                i++;
                k++;
            }

            while(j<n2){
                a[k]=nums2[j];
                j++;
                k++;
            }

            return a;

        }

        }

