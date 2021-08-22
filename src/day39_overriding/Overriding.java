package day39_overriding;

public class Overriding {
	
	/*
	 * parentteki bir metodu child klasta özelleştirmek ve kullanmak
	 * 
	 * kurallar
	 * 1. overriding yapılırken parent signature (method signature)
	 * kesinlikle değiştirilemez
	 * 
	 * 2. overriding yapılırken "access modifier belli kurallara göre
	 * degistirilebilir
	 * 
	 * 3. overriding yaratılırken "return type" belirli kurallara göre
	 * değiştirilebilir.
	 * 
	 * 4. overriding yaratılırken method body çok büyük ihtimalle değiştirilir
	 * ama değiştirilmezse CTE vermez. sadece boşa yorulmuş oluruz.
	 * 
	 * 5. overriding için parent child ilişkisi şarttır. bu ilişki yoksa
	 * bu sistem işlemez. inheritance şart
	 * 
	 * 6. Overridden method--parentteki değiştirilen
	 * Overriding method--childdeki değiştiren
	 * 
	 * 7. overriding yaparken child babayı daraltamaz ama genişletebilir.
	 * söz gelimi childdeki methodun başına public koyabilirsin. ama protected diyerek
	 * parent eğer public ise daraltma yapamazsın. ama protected bir parenti public yapabilirsin
	 *  
	 * 8. overriding ve overridden methodların return type ları aynı olmak zorunda
	 * 
	 * 9. wrapper data türü ile primitiv data türü de eşleşmiyor. 
	 * covaryant, yani geri dönüşümlü, eşleşebilir olmalı. Integer deyince int diyemezsin herhangi
	 * bir tarafa
	 * 
	 * 10. javanın create ettiği Integer gibi classlar return type olduğu gibi kullancıının 
	 * creat ettiği class da 23. satırdaki gibi return type olur. 
	 * 
	 * 11. Static methodlar override edilemezler. Çünkü statik gökteki ay gibidir. 
	 * 
	 * 12. Private methodlar override edilemez. Çünkü private.
	 * 
	 * 13. Final methodlar override edilemez çünkü son hali. Bitmiş ürün.
	 * 
	 * 14. polimorfizm overloading ve overridingden, ikisinden birden oluşan yapıya denir.
	 * 
	 * overloading: 
	 * public void yemek(){...}
	 * public void yemek(String tatli){...}
	 * public void yemek(String tatli, int ucret){...}
	 * 
	 * overriding:
	 * public void icmek(){syso(gazoz)}
	 * public void icmek(){{syso(dark ve sek bir kahve)}
	 * public void icmek(){{syso(ucret)}
	 * 
	 * overloading ile overriding farklar:
	 * 
	 * overloading'te method signature değiştirilir. isim ve parametre
	 * overriding'te method signature asla değiştirilemez. 
	 * 
	 * overloading için inheritance gerekli değil
	 * overriding te inheritance şart
	 * 
	 * overloadingte body değiştirilemeden kullanılır.
	 * overridingte body nerdeyse her zaman değiştirilir. 
	 * 
	 * Static methodlar override edilemezler ama overloading edilebilir. 
	 * Private methodlar override edilemezler ama overloading edilebilirler.
	 * 
	 * 
	 */
	
	

}
