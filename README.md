## TurengAPI

Turkish <-> English Dictionary

*Data source: http://tureng.com/*

**How to use:**
```java
TurengAPI tureng = new TurengAPI();

// input can be in Turkish or English
ArrayList<Result> results = tureng.translate("hava durumu");

for (Result result : results)
	System.out.println( result );
```

**Output:**
```
hava durumu -> (Common Usage, n.) weather
hava durumu -> (General, n.) weather forecast
hava durumu -> (General, n.) weather condition
hava durumu -> (Technical, -) weather condition
hava durumu -> (Computer, -) weather
hava durumu -> (Aeronautic, -) air conditions
hava durumu -> (Meteorology, -) weather condition
hava durumu (hava tahmini) -> (General, n.) weather forecast
hava durumu haritalar� -> (General, n.) weather map
hava durumu program� sunan kimse -> (General, n.) forecastman
hava durumu radar� -> (General, n.) weather radar
hava durumu s�zl��� -> (General, n.) weather dictionary
hava durumu sunucusu -> (General, n.) weather man
hava durumu sunucusu -> (General, n.) weather reporter
hava durumu sunucusu -> (General, n.) weathergirl
hava durumu sunucusu -> (General, n.) weather presenter
hava durumu tahlili -> (General, n.) weather analysis
hava durumu tahmini -> (General, n.) weather forecasting
�ng�r�lemeyen hava (durumu) -> (General, n.) unpredictable weather
yerel hava durumu -> (General, n.) local weather forecast
hava durumu g�stergeci -> (Technical, -) weatherglass
maddenin durumu hava, s�v�, gaz gibi -> (Technical, -) state of matter
sinoptik hava durumu -> (Technical, -) synoptic situation
sinoptik hava durumu haritas� -> (Technical, -) synoptic weather chart
sinoptik hava durumu haritas� -> (Technical, -) synoptic chart
�nemli hava durumu bilgisi -> (Aeronautic, -) sigmet information
�nemli hava durumu bilgisi -> (Aeronautic, -) sigmet information
orta burun eti i�erisinde hava bulunmas� durumu -> (Medical, -) concha bullosa
g�r�lmemi� hava durumu -> (Environment, -) unusual weather
say�sal hava durumu tahmini -> (Environment, -) numerical weather prediction
cephe hava durumu -> (Meteorology, -) frontal weather
hava durumu sunucusu -> (Meteorology, -) weatherman
hava durumu sunucusu -> (Meteorology, -) weather forecaster
radyo ile hava durumu yard�m� -> (Meteorology, -) radio weather aids
u�ulabilecek en k�t� hava durumu -> (Meteorology, -) weather minimum
hava ak�n� haber verme ve ikaz durumu -> (Military, -) air raid warning condition
hava alarm durumu -> (Military, -) air alert
hava savunma haz�rl�k durumu -> (Military, -) air defence readiness
hava savunma top�usu ate� kontrol durumu -> (Military, -) anti-aircraft control condition
hava savunma top�usu haz�rl�k durumu -> (Military, -) air defence artillery condition of readiness
```
