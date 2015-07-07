## SozlukAPI

Turkish <-> English Dictionary API. Translations are retrieved from the websites *Tureng* and *Zargan*.

**How to use:**
```java
SozlukAPI tureng = new TurengAPI();
SozlukAPI zargan = new ZarganAPI();

// input can be in Turkish or English
ArrayList<Result> results = tureng.translate("pay out");

for (Result result : results)
	System.out.println( result );

System.out.println();

// input can be in Turkish or English
results = zargan.translate("geri g�t�rmek");

for (Result result : results)
	System.out.println( result );
```

**Output:**
```
en-tr:	pay out -> (General, v.) ac�s�n� ��karmak
en-tr:	pay out -> (General, v.) �demek (paray�)
en-tr:	pay out -> (General, v.) harcamak
en-tr:	pay out -> (General, v.) gev�etmek (ip/zincir vb'ni)
en-tr:	pay out -> (General, v.) �demek
en-tr:	pay out -> (General, v.) ac�s�n� ��kartmak
en-tr:	pay out -> (Trade/Economic, -) �demek
en-tr:	pay out -> (Marine, -) kaloma etmek
en-tr:	pay out of pocket -> (General, v.) cebinden �demek
en-tr:	pay out of pocket -> (General, v.) cepten �demek
en-tr:	pay out of pocket -> (General, v.) kendi cebinden �demek
en-tr:	you should figure out a way to pay him his money -> (Speaking, -) ona, paras�n� �demenin bir yolunu bulmal�s�n
en-tr:	constant pay out ratio -> (Trade/Economic, -) sabit oranda kar pay� da��t�m�
en-tr:	pay-out ratio money -> (Trade/Economic, -) pay ba��na kar�n bir y�zdesi oran�nda da��t�lan kar pay�
en-tr:	mustering-out pay -> (Military, -) terhis tahsisat�

tr-en:	geri g�t�rmek -> (-, Fiil) to carry back
tr-en:	geri geri g�t�rmek -> (-, Fiil) to back up
tr-en:	yabanc� �lkelerdeki yat�r�mlardan elde edilen kazan�lar� kendi memleketine geri g�t�rmek -> (-, Fiil) to repatriate earnings from foreign investments
tr-en:	sermayeyi kendi memleketine geri g�t�rmek -> (-, Fiil) to repatriate capital
tr-en:	otomobili geri geri g�t�rmek -> (-, Fiil) to back a car
```

*Data sources:*
* *http://tureng.com/*
* *http://www2.zargan.com/*
