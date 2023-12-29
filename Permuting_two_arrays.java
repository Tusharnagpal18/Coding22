//Hackerank
  public static String twoArrays(int k, List<Integer> A, List<Integer> B) {
    // Write your code here
    int sum=0;
    Collections.sort(A);
            Collections.sort(B,Collections.reverseOrder());
            for(int i=0;i<A.size();i++)
            {
                sum=A.get(i)+B.get(i);
                if(sum<k)
                  return "NO";
            }
            return "YES";
    }

