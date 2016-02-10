package by.it.podelstchikova.jd02.TaskC;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Random;

public class Main {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader=new BufferedReader(inputStreamReader);
        System.out.println("razmer:\t");
        int n=Integer.parseInt(bufferedReader.readLine());
        Random rand = new Random();

        int[][] a = new int[n][n];
        int k1=0;
        for (int i = 0; i <n ; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j]= rand.nextInt(((n+n)))-n;

            }
        }

        System.out.println("vivod Matrix: \n");

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+"\t");

            }
            System.out.println();

        }
        int summ=0;
        for (int i = 0; i < n; i++) {

            for (int j = 0; j < n; j++) {
                if (a[i][j]>0) {j++;
                    while (a[i][j] < 0) {summ+=a[i][j];j++;}
                }
                System.out.println(summ);
                break;
            }
            summ=0;
        }

        int [] min =new int[n];
        int count = 0;
        for (int i = 0; i <n ; i++) {
            min[i]=0;
        }
        int min0=a[0][0], i0=0,j0=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (min0>a[i][j])
                {
                    min0=a[i][j];
                    j0=j;
                    i0=i;
                }

            }

        }
        int [] min1=new int[n];
       int [] min2= new int [n];
        System.out.println();
        System.out.println("min na 1,1");
System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+"\t");

            }

            System.out.println();
        }
        System.out.println();
        for (int i = 0; i < n; i++) {

            k1 = a[i][j0];
            a[i][j0]=a[i][0];
            a[i][0]=k1;

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+"\t");

            }
            System.out.println();

        }

        System.out.println();

        for (int i = 0; i <n; i++) {
            k1 = a[i0][i];
            a[i0][i]=a[0][i];
            a[0][i]=k1;

        }

        System.out.println();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a[i][j]+"\t");

            }
            System.out.println();

        }

        System.out.println();


        int buff=0;
        System.out.println("povorot na 90");
        int[][] a1=new int[n][n];
        for (int i = 0,k=n-1; i < n; i++,k--) {
            for (int j = 0; j < n; j++) a1[i][j] = a[j][k];

        }
        int[] sr = new int[n];
        for (int i = 0; i < n; i++) {
            sr[i]=0;
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a1[i][j]+"\t");
                sr[i]+=a1[i][j];

            }


            System.out.println();

        }
            for (int i = 0; i < n; i++) {
                sr[i] /= n;
            }
            for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) a1[i][j] =a1[i][j] - sr[i];

        }


        System.out.println("transponirovanie");
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a1[i][j]+"\t");

            }
            System.out.println();

        }

        for (int i = 0; i < n; i++) {
            for (int j = i; j < n; j++) {
                buff = a1[i][j];
                a1[i][j]=a1[j][i];
                a1[j][i]=buff;

            }

        }

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a1[i][j]+"\t");

            }
            System.out.println();

        }
        int max=0;
        System.out.println();System.out.println();System.out.println("0 elem");
        int len=n;
        for (int i = 0; i < len; i++) {
            for (int j = 0; j < len; j++) {
                if (a1[j][i] ==0)
                {  k1=a1[j][i];
                    a1[j][i]=a1[len-1][i];
                    a1[len-1][i]=k1;
                    len--;
                }



            }
            len=n;
            System.out.println();
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(a1[i][j]+"\t");

            }
            System.out.println();

        }
        System.out.println("max elem");

        max=0;

        int [][] masi = new int[n][n];
        int [][] masj = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (max<a1[i][j]) max=a1[i][j];
            }
            System.out.println(max);
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (a1[i][j]==max) {
                    masi[i][j]=1;
                    masj[i][j]=1;

                }
            }

        }
        for (int i = 0; i <n  ; i++) {


            for (int j = 0; j < n; j++) {
                if (masi[i][j]==1)
                for (int j1 = 0; j1 < n; j1++) {
                    masi[i][j1] = 1;
                }
                if (masj[i][j]==1)
                for (int j1 = 0; j1 < n; j1++) {
                    masj[j1][j] = 1;
                }
            }
        }
        int lenst=0;
        int lenstr=0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(masi[i][j]+" "+masj[i][j]+"\t"+"\t");

            }
            System.out.println();

        }
        for (int i = 0; i < n; i++) {
        if (masi[i][0]!=1) lenst++;
        if (masj[0][i]!=1) lenstr++;
           }


        int [][] an=new int[n][n];
        int kn=0;

            for (int i = 0; i<n; i++) {
                 for (int j = 0,ln=0; j<n; j++) {

                     if ((masi[i][j]==1 || masj[i][j]==1)&& (i==0 && j==0))
                     {
                         i++;
                         j++;
                     }
                     if ((masi[i][j]==1 && masj[i][j]==0)&& ( j==0 && i<n))
                     {
                         i++;
                     }

                     if((masi[i][j]!=1) && (masj[i][j]!=1))
                     {
                        an[kn][ln]=a1[i][j];
                        ln++;
                     }

            }

 ++kn;

        }
        for (int i = 0; i < lenst; i++) {
            for (int j = 0; j < lenstr; j++) {
                System.out.print(an[i][j]+"\t\t");
            }
            System.out.println();
        }


        System.out.println();


        System.out.println();

        bufferedReader.close();}


}
