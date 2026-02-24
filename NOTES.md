# Programmieren – Zusammenfassung

---

## Primitive Datentypen
Primitive Datentypen speichern **direkt einen Wert**.

### Ganzzahlen
| Typ   | Größe | Beispiel |
|-------|-------|----------|
| `byte`  | 8 Bit  | `byte b = 10;` |
| `short` | 16 Bit | `short s = 1000;` |
| `int`   | 32 Bit | `int i = 100000;` |
| `long`  | 64 Bit | `long l = 100000L;` |

### Kommazahlen
| Typ    | Größe | Beispiel |
|--------|-------|----------|
| `float`  | 32 Bit | `float f = 3.14F;` |
| `double` | 64 Bit | `double d = 3.14;` |

### Weitere primitive Typen
| Typ      | Bedeutung        | Beispiel |
|----------|------------------|----------|
| `char`     | einzelnes Zeichen | `char c = 'A';` |
| `boolean`  | Wahrheitswert     | `boolean ok = true;` |

---

## String (kein primitiver Datentyp)
`String` ist ein **Objekt** (Klasse), kein primitiver Datentyp.

Beispiel:
```java
String text = "Hallo";
```

### Vergleich: `==` vs `.equals()`
```java
int a = 5;
int b = 5;
System.out.println(a == b);   // true (Wertvergleich)

String s1 = new String("Hallo");
String s2 = new String("Hallo");

System.out.println(s1 == s2);        // false (Referenzvergleich)
System.out.println(s1.equals(s2));   // true (Inhaltsvergleich)
```

---

## Operatoren

### Arithmetische Operatoren
| Operator | Bedeutung       | Beispiel | Ergebnis |
|----------|-----------------|----------|----------|
| `+` | Addition        | `3 + 2`  | `5` |
| `-` | Subtraktion     | `5 - 2`  | `3` |
| `*` | Multiplikation  | `4 * 3`  | `12` |
| `/` | Division        | `10 / 2` | `5` |
| `%` | Rest (Modulo)   | `10 % 3` | `1` |

### Vergleichsoperatoren
| Operator | Bedeutung |
|----------|-----------|
| `==` | Gleich |
| `!=` | Ungleich |
| `<`  | Kleiner als |
| `<=` | Kleiner oder gleich |
| `>`  | Größer als |
| `>=` | Größer oder gleich |

### Logische Operatoren
| Operator | Bedeutung |
|----------|-----------|
| `&&` | Logisches UND |
| `||` | Logisches ODER |
| `!`  | Logische Verneinung |

### Ternärer Operator
Kurzform einer einfachen `if-else`-Zuweisung:

```java
bedingung ? wertWennTrue : wertWennFalse;
```

Beispiel:
```java
int max = (a > b) ? a : b;
```

---

## Verzweigungen

### if-else
Wird verwendet für Bereiche oder komplexe Bedingungen.

```java
if (zahl > 0) {
    System.out.println("Positiv");
} else {
    System.out.println("Nicht positiv");
}
```

### switch
Wird verwendet, wenn nur Gleichheit geprüft wird.

```java
switch (tag) {
    case 1:
        System.out.println("Montag");
        break;
    case 2:
        System.out.println("Dienstag");
        break;
    default:
        System.out.println("Unbekannt");
}
```

---

## Schleifen (Loops)
Schleifen werden verwendet, um Anweisungen mehrfach auszuführen.

### while-Schleife (kopfgesteuert)
- Bedingung wird **vor** jedem Durchlauf geprüft.
- Kann **0-mal** oder öfter ausgeführt werden.

```java
int i = 1;
while (i <= 5) {
    System.out.println(i);
    i++;
}
```

### do-while-Schleife (fußgesteuert)
- Bedingung wird **nach** dem Durchlauf geprüft.
- Wird **mindestens einmal** ausgeführt.

```java
int x = 1;
do {
    System.out.println(x);
    x++;
} while (x <= 5);
```

### for-Schleife (Zählschleife)
Wird verwendet, wenn die Anzahl der Durchläufe bekannt ist.

```java
for (int m = 1; m <= 5; m++) {
    System.out.println(m);
}
```

### break
Beendet eine Schleife sofort.

```java
for (int i = 1; i <= 10; i++) {
    if (i == 5) {
        break;
    }
}
```

### continue
Überspringt den restlichen Schleifendurchlauf.

```java
for (int i = 1; i <= 5; i++) {
    if (i == 3) {
        continue;
    }
    System.out.println(i);
}
```

---

## Arrays
- Ein Array speichert **mehrere Werte gleichen Typs**.
- Die Größe muss beim Erstellen festgelegt werden.
- Danach kann die Länge nicht mehr verändert werden.

Beispiel:
```java
int[] array = new int[100];
```

Werte mit einer Schleife setzen:
```java
for (int i = 0; i < array.length; i++) {
    array[i] = i;
}
```

---

## printf-Formatierung

### Häufige Platzhalter
| Platzhalter | Bedeutung |
|-------------|-----------|
| `%d` | Ganze Zahl (decimal) |
| `%f` | Kommazahl (floating point) |
| `%s` | Text (String) |
| `%c` | Einzelnes Zeichen |

Beispiel:
```java
double preis = 12.3456;
System.out.printf("Preis: %.2f Euro", preis);
```

Ergebnis:
```
Preis: 12.35 Euro
```

---

## Grundbegriffe der Objektorientierung

| Begriff | Bedeutung |
|---------|-----------|
| Klasse | Bauplan für Objekte |
| Objekt | Konkrete Instanz einer Klasse |
| Attribut | Eigenschaft eines Objekts |
| Methode | Funktion/Verhalten eines Objekts |

Beispiel:
```java
class Auto {
    String farbe;     // Attribut

    void fahren() {   // Methode
        System.out.println("Das Auto fährt.");
    }
}
```

---

# Mögliche Klausurfragen

### 1) Unterschied zwischen primitiven Datentypen und Objekten
**Antwort:**
- Primitive Datentypen speichern direkt einen Wert.
- Objekte sind Instanzen von Klassen und werden über Referenzen verwaltet.

### 2) Wann verwendet man `==` und wann `.equals()`?
**Antwort:**
- `==` bei primitiven Datentypen (Wertvergleich).
- `.equals()` bei Objekten wie `String` (Inhaltsvergleich).

### 3) Unterschied zwischen `float` und `double`
**Antwort:**
- `float`: 32 Bit, weniger genau.
- `double`: 64 Bit, genauer und Standard in Java.

### 4) Wann verwendet man `switch` statt `if-else`?
**Antwort:**
Wenn nur Gleichheit eines Wertes geprüft wird.

### 5) Unterschied zwischen kopf- und fußgesteuerter Schleife
**Antwort:**
- `while`: Bedingung zuerst → kann 0‑mal laufen.
- `do-while`: Ausführung zuerst → läuft mindestens 1‑mal.

### 6) Was macht der ternäre Operator?
**Antwort:**
Er ersetzt eine einfache `if-else`-Zuweisung in einer Zeile.



--------------------------


Prozeduale Programmierung


---
...

-----
Objektorientierte Programmierung


- Klassen: komplexe datentypen
- Attribute: Eigenschaften von Objekten


- Klassen: Bauplan für Objekte
- Objekte: Konkrete Ausprägung von Klassen


#### Objekte und Referenzen








mit == wird der inhalt geprüft bei referenzen anders (equals bei Zeichenketten und Objekten)

Referenzen - Speicherort


neue objekte entstehen durch new operator

arraylist unterschied zu normalem array wissen


this. referenz bedeutung usw

---

### Konstrukor:
    - werden einmal aufgerufen: beim Erstellen des Objekts
    - muss so heißen, wie die Klasse (class)
    - hat keinen Rückgabewert (return)
    - man kann diese nicht selbst aufrufen -> geht nur durch new = beim Erstellen eines Objekts

    Frage: Warum darf Konstruktor keinen return haben:
            - weil die Objekt-Referenz schon automatisch existiert. Der Konstruktor arbeitet nur mit dieser bereits erzeugten Referenz.


### Unveränderliche Attribute: mit final
    - z.B.: private final String color;

    public LightBulb(String color){
        this.color = color;
    } //Konstruktor


    finale unveränderliche Attribute in Konstruktor, weil nur einmaliger Aufruf

    final muss zwingend initialisiert werden!!

---

### "Überladene Methoden"
sind Methoden, die den selben Namen haben in der selben Klasse haben aber unterschiedliche Parameter.


---

Bei Entitätsklassen: am besten eigene toString()-Methoden erstellen

bei toSting drüber @Override schreiben 

---

### Statische und nichtstatische Elemente
_erkären mit Beispielen usw_

Objektorientierung und sttatische Elemente gehen nicht

gehören der Klasse für alle Elemente

nicht statische sind objektbezogen

---

public final static

öffentlich, statisch usw.

---
in schleifen bei Länge bon Arrays = .length(), bei ArrayList = .size()

bei List:
        ArrayList<String> names = new ArrayList<>();

        names.add("Hans");
        names.add("Peter");
        names.add("Lisa");
        names.add("Anna");

        /* klassische for-Schleife */
        for(int i=0; i<names.size(); i++){
            String name = names.get(i);
        }
--> auch mit get usw


---> mache tabelle mit vergleich wie man was wo nutzt

---



package main;

import java.util.ArrayList;

public class D28_ForEachLoop {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();

        names.add("Hans");
        names.add("Peter");
        names.add("Lisa");
        names.add("Anna");

        /* klassische for-Schleife */
        for(int i=0; i<names.size(); i++){
            String name = names.get(i);
            System.out.println(name);
        }

        System.out.println();


        

        /* For-Each-Schleife */

        for (String name : names){ // "Für jeden Namen in der Namensliste"
            System.out.println(names);
        }

    }
}




---

FÜR KLAUSUR !!

toString methode aufschreiben
for-each