package day24accessmodifiersinheritiance;

public class Student {

/*
   Access Modifier
   1)public     2)protected
   3)default (Access Modifier'i default yapmak icin access modifier yazmayiz)
   yazarsan kizar
   4)private

   Note: Access Modifier'lari genisden dara dogru sayiniz
         public > protected > default > private
   Note: Access Modifier'lari birer birer aciklayiniz
         public olanlar her class'dan kullanilabilir
         protected olanlar baska package'lerden kullanilamaz
         ancak baska package'de "child class" icinden kullanilabilir
         default olanlar baska package'den kullanilamazlar
         private olanlar sadece olsturulduklari Class icinde kullanilabilirler
   Note: "protected" ile "default" un farkini soyleyiniz.
         protected olanlar baska package'lerden kullanilamaz ancak
         baska package'de "child class" icinden kullanilabilir
         default olanlar baska package'den kullanilamazlar
   Note: Class'lar icin hangi Access Modifier'lar kullanilabilir.
         public, default kullanilir ama protected ve private kullanilamaz
*/
        //public her class dan kullanılabilir.
        public  String stdName="Ebubekir Can";

        //protected olanlar başka packagedan sadece child classlardan görülür.
        protected   String address="Istanbul";


     //default olanlar başka packagedan kullanılamaz,iş yeri maili
        String email="ebcan@gmail.com";

        //private olanlar sadece oluşturuldukları class içinde kullanılır. Tc no
        private String tcNo="35151651";

}
