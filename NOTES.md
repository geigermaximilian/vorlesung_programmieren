# Programmieren – Zusammenfassung

---

## Primitive Datentypen
Primitive Datentypen speichern **direkt einen Wert**.

### Ganzzahlen
| Typ | Größe | Beispiel |
|-----|-------|----------|
| `byte` | 8 Bit | `byte b = 10;` |
| `short` | 16 Bit | `short s = 1000;` |
| `int` | 32 Bit | `int i = 100000;` |
| `long` | 64 Bit | `long l = 100000L;` |

### Kommazahlen
| Typ | Größe | Beispiel |
|-----|-------|----------|
| `float` | 32 Bit | `float f = 3.14F;` |
| `double` | 64 Bit | `double d = 3.14;` |

### Weitere primitive Typen
| Typ | Bedeutung | Beispiel |
|-----|-----------|----------|
| `char` | einzelnes Zeichen | `char c = 'A';` |
| `boolean` | Wahrheitswert | `boolean ok = true;` |

---

## String (kein primitiver Datentyp)
`String` ist ein **Objekt** (Klasse), kein primitiver Datentyp.

Beispiel:
```java
String text = "Hallo";
```

Vergleich:
- Primitive Typen → `==`
- Objekte (`String`) → `.equals()`

---

## Operatoren

### Arithmetische Operatoren
| Operator | Bedeutung | Beispiel | Ergebnis |
|---------|-----------|----------|----------|
| `+` | Addition | `3 + 2` | `5` |
| `-` | Subtraktion | `5 - 2` | `3` |
| `*` | Multiplikation | `4 * 3` | `12` |
| `/` | Division | `10 / 2` | `5` |
| `%` | Rest (Modulo) | `10 % 3` | `1` |

---

### Vergleichsoperatoren
| Operator | Bedeutung |
|----------|-----------|
| `==` | Gleich |
| `!=` | Ungleich |
| `<` | Kleiner als |
| `<=` | Kleiner oder gleich |
| `>` | Größer als |
| `>=` | Größer oder gleich |

---
 
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

---

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

---

### for-Schleife (Zählschleife)
Wird verwendet, wenn die Anzahl der Durchläufe bekannt ist.

```java
for (int m = 1; m <= 5; m++) {
    System.out.println(m);
}
```

---

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

# Mögliche Klausurfragen (Gesamter Stoff)

### 1) Was ist der Unterschied zwischen primitiven Datentypen und Objekten?
**Antwort:**
- Primitive Datentypen speichern direkt einen Wert.
- Objekte sind Instanzen von Klassen und werden über Referenzen verwaltet.

---

### 2) Wann verwendet man `==` und wann `.equals()` in Java?
**Antwort:**
- `==` bei primitiven Datentypen.
- `.equals()` bei Objekten wie `String`.

--> mache noch ein Beispiel, wie man beides benutzt

---

### 3) Was ist der Unterschied zwischen `float` und `double`?
**Antwort:**
- `float`: 32 Bit, weniger genau.
- `double`: 64 Bit, genauer und Standard.

---

### 4) Wann verwendet man `switch` statt `if-else`?
**Antwort:**
Wenn nur Gleichheit eines Wertes geprüft wird.

---

### 5) Unterschied zwischen kopf- und fußgesteuerter Schleife?
**Antwort:**
- `while`: Bedingung zuerst → kann 0-mal laufen.
- `do-while`: Ausführung zuerst → läuft mindestens 1-mal.

---

### 6) Was macht der ternäre Operator?
**Antwort:**
Er ersetzt eine einfache `if-else`-Zuweisung in einer Zeile.




system.out.printf (formatierungsmöglichkeiten)


Platzhalter
Abkürzung
Bedeutung
%d
decimal
ganze Zahl im Dezimalsystem
%f
floating point
Kommazahl (Gleitkommazahl)
%s
string
Text
%c
character
einzelnes Zeichen

%.2f %
Beginn eines Platzhalters
.2
2 Nachkommastellen
f
Kommazahl (floating point)


        /* Vergleichs-Operatoren: <, <=, >, >=, ==, != */ 

        /* Logische Operatoren: && (logisches Und), || (logisches Oder), ! (logische Verneinung) */






#Arrays
am Anfang muss man Größe/Länge des Arrays festlegen. Danach geht nicht mehr --> Einschränkung

int[] array = new int[100];

arrays auch mit zählschleifen/for-schleifen möglich werte einzutragen, hochzuzählen usw --> einfacher und kompakter als 100 variablen deklarieren und initialisieren zu müssen.




Java unterschied von Methoden, Klassen, Attributen, (Objekt)