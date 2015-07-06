## SozlukAPI

Turkish <-> English Dictionary API. Translations are retrieved from the websites *Tureng* and *Zargan*.

**How to use:**
```java
SozlukAPI tureng = new TurengAPI();
SozlukAPI zargan = new ZarganAPI();

// input can be in Turkish or English
ArrayList<Result> results = tureng.translate("�OLUK �OCUK");

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
tr-en:	�oluk �ocuk -> (General, n.) fry
tr-en:	�oluk �ocuk -> (General, n.) brood
tr-en:	�oluk �ocuk -> (General, n.) family
tr-en:	�oluk �ocuk -> (General, n.) wife and children
tr-en:	�oluk �ocuk -> (General, n.) children
tr-en:	�oluk �ocuk -> (General, n.) offspring
tr-en:	�oluk �ocuk -> (General, adv.) all the family
tr-en:	�oluk �ocuk sahibi -> (General, n.) having a family
tr-en:	�ocuk �oluk -> (Idioms, -) the small fry

tr-en:	�oluk �ocuk -> (, -) household
tr-en:	�oluk �ocuk -> (, -) home- folks
tr-en:	�oluk �ocuk -> (, -) family
tr-en:	�oluk �ocuk -> (, -) descent
```

*Data sources:*
* *http://tureng.com/*
* *http://www2.zargan.com/*
