# Zadanie rekrutacyjne

### 1. Opis i cel zadania
1. odczytanie zawartości pliku tekstowego, który zawiera dane w ustalonym formacie
2. na podstawie zawartości pliku wypisać **sumę** kwot w nim zapisanych
3. zadanie MUSI zostać wykonane z wykorzystaniem języka Java

### 2. Opis pliku wejściowego
1. Kodowanie pliku to `utf-8`
2. Każda linia w pliku zawiera informacje o jednej transakcji
3. Każda transakcja zawiera informacje o:
    *  osobie inicjującej transakcję (imię, nazwisko)
    *  konto źródłowe, konto docelowe
    *  kwocie transakcji z informacją o walucie (PLN)
4. Informacje zapisane w każdej linijce mają następujący format:
    *  znak '@' (tzw. małpa) - oznaczający początek pary klucz:wartość, gdzie kluczem jest nazwa pola
    *  po znaku inicjującym, znajduje się klucz, który jest jedną z wartości:
        *  name
        *  surname
        *  src_iban
        *  dst_iban
        *  amount
    *  po kluczu znajduje się znak ':' (dwukropek), oddzielający klucz od wartości
    *  po znaku ':' znajduje się wartość pola
    *  przykładowa linijka będzie miała następującą formę: `@name:Jan@surname:Kowalski@src_iban:84063099651078062132711059@dst_iban:16612843863420872434731304@amount:12,34PLN`
		
### 3. Podsumowanie
1. Uruchomić program można z wiersza poleceń, gdzie można jako parametr podać ścieżkę do pliku z danymi.
```
java ZadanieRekrutacyjne \sciezka\plik.txt
```
2. Kod wykorzystuje klasę Money, która przechowuje informację o kwotach w złotych i pozwala ona na dodawanie i odejmowanie kwot do aktualnie przechowywanych.
3. Klasa Money **nie** przechowuje informacji o kwotach w zmiennej `double` (zbyt niebezpieczna w operacjach pieniężnych).