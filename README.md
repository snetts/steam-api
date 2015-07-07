## SozlukAPI

Turkish <-> English Dictionary API. Translations are retrieved from the websites *Tureng* and *Zargan*.

**How to use:**
```java
SozlukAPI tureng = new TurengAPI();
SozlukAPI zargan = new ZarganAPI();

// input can be in Turkish or English
ArrayList<Result> results = tureng.translate("LIVE ON");

for (Result result : results)
	System.out.println( result );

System.out.println();

// input can be in Turkish or English
results = zargan.translate("�OLUK �OCUK");

for (Result result : results)
	System.out.println( result );
```

**Output:**
```
en-tr:	live on -> (General, v.) ge�imini s�rd�rmek
en-tr:	live on -> (General, v.) ya�am�n� idame ettirmek
en-tr:	live on -> (General, v.) ile beslenmek
en-tr:	live on -> (General, v.) ile ge�inmek
en-tr:	live on -> (General, v.) ge�inmek
en-tr:	live on a very small amount of money -> (General, v.) �ok az bir parayla ge�inmek
en-tr:	live on borrowed money -> (General, v.) bor� yemek
en-tr:	live on one's nerves -> (General, v.) diken �st�nde olmak
en-tr:	live on someone else -> (General, v.) hara� yemek
en-tr:	live on the border of -> (General, v.) 'n�n s�n�r�nda ya�amak
en-tr:	live on the edge -> (General, v.) u�larda ya�amak
en-tr:	live on the edge -> (General, v.) hayat� u�larda ya�amak
en-tr:	live on the margins of society -> (General, v.) toplumun s�n�rlar�nda/k�y�s�nda ya�amak
en-tr:	live on the razor's edge -> (General, v.) �l�mle kal�m aras�nda olmak
en-tr:	live on the razor's edge -> (General, v.) iki ate� aras�nda kalmak
en-tr:	live high on the hog -> (Colloquial, -) para i�inde y�zmek
en-tr:	live high on the hog -> (Colloquial, -) l�ks i�inde ya�amak
en-tr:	live on one's own -> (Colloquial, -) tek ba��na ya�amak
en-tr:	live high on the hog -> (Idioms, -) �atafatl� bir hayat s�rmek
en-tr:	live high on the hog -> (Idioms, -) �ok rahat bir ya�am s�rmek
en-tr:	live high on the hog -> (Idioms, -) �ok zengin olmak
en-tr:	live high on the hog -> (Idioms, -) bir eli ya�da bir eli balda olmak
en-tr:	live high on the hog -> (Idioms, -) para i�inde y�zmek
en-tr:	live high on the hog -> (Idioms, -) har vurup harman savurmak
en-tr:	live on a borrowed time -> (Idioms, -) g�nleri say�l� olmak
en-tr:	live on an amount of money -> (Idioms, -) belli bir parayla hayat�n� idame ettirmek
en-tr:	live on an amount of money -> (Idioms, -) belirli miktar parayla ya�amak
en-tr:	live on borrowed time -> (Idioms, -) az zaman� kalm�� olmak
en-tr:	live on borrowed time -> (Idioms, -) bir g�z� topra�a bakmak
en-tr:	live on borrowed time -> (Idioms, -) �lmekte olmak
en-tr:	live on borrowed time -> (Idioms, -) say�l� g�nleri kalmak
en-tr:	live on borrowed time -> (Idioms, -) bir aya�� mezarda olmak
en-tr:	live on borrowed time -> (Idioms, -) cabadan ya�amak
en-tr:	live on one's nerves -> (Idioms, -) heyecanl� bir karaktere sahip olmak
en-tr:	live on one's own -> (Idioms, -) (genelde ekonomik �zg�rl���n� kazan�p) kendi ba��na ya�amak
en-tr:	live on one's wits -> (Idioms, -) zekas� sayesinde ya�am�n� s�rd�rmek
en-tr:	live on the breadline -> (Idioms, -) a��r� yoksul olmak
en-tr:	live on the breadline -> (Idioms, -) a�l�k s�n�r�nda ya�amak
en-tr:	live on the edge -> (Idioms, -) tehlikeli ya�amak
en-tr:	live on the fat of the land -> (Idioms, -) yedi�i �n�nde yemedi�i arkas�nda olmak
en-tr:	live on the fat of the land -> (Idioms, -) tuzu kuru olmak
en-tr:	live on the fat of the land -> (Idioms, -) �ok iyi durumda olmak
en-tr:	live on the fat of the land -> (Idioms, -) her �eyin en iyisi ile ge�inmek
en-tr:	live on the fat of the land -> (Idioms, -) bolluk bereket i�inde ya�amak
en-tr:	live on the fat of the land -> (Idioms, -) rahat bir ya�am s�rmek
en-tr:	which/what floor do you live on? -> (Speaking, -) evin ka��nc� katta?
en-tr:	which/what floor do you live on? -> (Speaking, -) ka��nc� katta oturuyorsunuz?
en-tr:	which/what floor do you live on? -> (Speaking, -) ka��nc� katta ya��yorsunuz?
en-tr:	which/what floor do you live on? -> (Speaking, -) ka��nc� katta oturuyorsun?
en-tr:	which/what floor do you live on? -> (Speaking, -) ka��nc� katta ya��yorsun?
en-tr:	which/what floor do you live on? -> (Speaking, -) eviniz ka��nc� katta?
en-tr:	live on something -> (Aeronautic, -) ile ya�amak
en-tr:	live on something -> (Aeronautic, -) ile ge�inmek
en-tr:	live on something -> (Aeronautic, -) ile beslenmek

tr-en:	�oluk �ocuk -> (-, -) household
tr-en:	�oluk �ocuk -> (-, -) home- folks
tr-en:	�oluk �ocuk -> (-, -) family
tr-en:	�oluk �ocuk -> (-, -) descent
```

*Data sources:*
* *http://tureng.com/*
* *http://www2.zargan.com/*
