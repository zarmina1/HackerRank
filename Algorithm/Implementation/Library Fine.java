    public static int libraryFine(int d1, int m1, int y1, int d2, int m2, int y2) {
    // Write your code here
 int hackosFine = 0;
     if(y2 < y1)
        {
            hackosFine = 10000;
        }
        else if(y2 == y1 )
        {
            if(m2 < m1)
            {
                hackosFine = (m1-m2) * 500;
            }
            else if(m2 == m1)
            {
                if(d2 < d1)
                {
                    hackosFine = (d1 - d2) * 15;
                }
            } 
        }
        return hackosFine;
    }