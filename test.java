class CodeRunner{
	 public static void main(String[] args)
    {
        int[][] array = 
        {{95, 86},
         {83, 92, 96},
         {78, 83, 93, 87, 88}};

        int sum = 0;
        double avg = 0.0;
        int avg_su = 0;

        for(int i=0; i<array.length; i++) {
            for(int j=0; j<array[i].length; j++) {
                sum += array[i][j]; //2차원 배열의 값을 꺼내서 총합을 구한다
                avg_su += 1; // 평균을 내기 위해 총 갯수를 구한다.
            }

        }

        avg = sum / avg_su; //총합/평균
 
        System.out.println("총합 : " + sum);
        System.out.println("평균 : " + avg);
        System.out.println("----------------------------------");

//-------------------------------------------------------------------------------------------------
        int arr[][] = new int[5][5];
        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 5; j++){
                arr[i][j] = ((i+1) * (j+1));
                System.out.print(arr[i][j] + "\t");
            }
            System.out.println();
        }
        
        System.out.println("----------------------------------"); 
        
        char[][] arr2 = new char[5][5];
		char n = 'a'; 
        
		for (int i=0; i<5;i++ )
		{for (int j=0; j<5; j++)
			{arr2[i][j] = n;
			n++;
			System.out.printf(arr2[i][j] + "\t");
			}System.out.println();
         
		}
	

    }//
}//
