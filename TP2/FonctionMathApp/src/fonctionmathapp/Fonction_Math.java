

package fonctionmathapp;

public class Fonction_Math {
    static public int factoriel(int n)
    {
      int f=1;
      if(n!=0)
      {
      for(int i=1;i<=n;i++)
          f=f*i;
          }
      return f;
    }
    static public int somme(int n)
    {
        int s=0;
        for(int i=1;i<=n;i++)
            s=s+i;
        return s;
    }
   static double racine(double x) 
   { return Math.sqrt(x);
   }
}
