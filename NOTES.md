## Mögliche Klausurfragen (Gesamter Stoff)

### 1) Was ist der Unterschied zwischen primitiven Datentypen und Objekten?
<details>
<summary>Antwort anzeigen</summary>

- Primitive Datentypen speichern **direkt einen Wert** (z. B. `int`, `double`, `char`, `boolean`).
- Objekte (z. B. `String`) sind **Instanzen von Klassen** und werden über Referenzen verwaltet.

</details>

---

### 2) Wann verwendet man `==` und wann `.equals()` in Java?
<details>
<summary>Antwort anzeigen</summary>

- `==` für **primitive Datentypen**.
- `.equals()` für **Objekte**, insbesondere `String`.

</details>

---

### 3) Was ist der Unterschied zwischen `float` und `double`?
<details>
<summary>Antwort anzeigen</summary>

- `float`: 32 Bit, geringere Genauigkeit, benötigt Suffix `F`.
- `double`: 64 Bit, höhere Genauigkeit, Standard für Kommazahlen.

</details>

---

### 4) Wann verwendet man `switch` und wann `if-else`?
<details>
<summary>Antwort anzeigen</summary>

- `switch`: Wenn nur **Gleichheit** eines Wertes geprüft wird.
- `if-else`: Bei **Bereichen** oder komplexen Bedingungen (`>`, `<`, `>=`, usw.).

</details>

---

### 5) Was ist der Unterschied zwischen kopf- und fußgesteuerter Schleife?
<details>
<summary>Antwort anzeigen</summary>

- Kopfgesteuert (`while`): Bedingung wird **vor** dem Durchlauf geprüft → kann **0‑mal** laufen.
- Fußgesteuert (`do-while`): Bedingung wird **nach** dem Durchlauf geprüft → läuft **mindestens 1‑mal**.

</details>

---

### 6) Was macht der ternäre Operator?
<details>
<summary>Antwort anzeigen</summary>

Er ersetzt eine einfache `if-else`-Zuweisung in einer Zeile:

```
bedingung ? wertWennTrue : wertWennFalse;
```

</details>
# Datentypen (Grundlagen)

## Primitive Datentypen in Java

### Ganzzahlen (ohne Nachkommastellen)
| Typ | Größe | Wertebereich (ca.) | Beispiel |
|-----|-------|--------------------|----------|
| `byte` | 8 Bit | -128 bis 127 | `byte b = 10;` |
| `short` | 16 Bit | -32.768 bis 32.767 | `short s = 1000;` |
| `int` | 32 Bit | ca. ±2 Milliarden | `int i = 100000;` |
| `long` | 64 Bit | sehr große Zahlen | `long l = 100000L;` |

### Kommazahlen (mit Nachkommastellen)
| Typ | Größe | Genauigkeit | Beispiel |
|-----|-------|-------------|----------|
| `float` | 32 Bit | ca. 7 Stellen | `float f = 3.14F;` |
| `double` | 64 Bit | ca. 15 Stellen | `double d = 3.14;` |

### Zeichen
| Typ | Größe | Beschreibung | Beispiel |
|-----|-------|--------------|----------|
| `char` | 16 Bit | einzelnes Zeichen | `char c = 'A';` |

### Wahrheitswert
| Typ | Beschreibung | Beispiel |
|-----|--------------|----------|
| `boolean` | `true` oder `false` | `boolean ok = true;` |

---

## String (kein primitiver Datentyp)

`String` ist **kein primitiver Datentyp**, sondern ein **Objekt** (eine Klasse).

Beispiel:
```java
String text = "Hallo";
```

**Wichtiger Unterschied:**
- Primitive Typen → Vergleich mit `==`
- `String` (Objekt) → Vergleich mit `.equals()`

---

## Ganzzahlen vs. Kommazahlen

### Ganzzahlen
- `byte`
- `short`
- `int`
- `long`

### Kommazahlen
- `float`
- `double`

---

# Operatoren

### Arithmetische Operatoren
| Operator | Bedeutung | Beispiel | Ergebnis |
|---------|-----------|----------|----------|
| `+` | Addition | `3 + 2` | `5` |
| `-` | Subtraktion | `5 - 2` | `3` |
| `*` | Multiplikation | `4 * 3` | `12` |
| `/` | Division | `10 / 2` | `5` |
| `%` | Rest (Modulo) | `10 % 3` | `1` |

---

## Vergleichsoperatoren
| Operator | Bedeutung |
|----------|-----------|
| `==` | Gleich |
| `!=` | Ungleich |
| `<` | Kleiner als |
| `<=` | Kleiner oder gleich |
| `>` | Größer als |
| `>=` | Größer oder gleich |

---

## Bedingter Operator (Ternärer Operator)

```java
bedingung ? wertWennTrue : wertWennFalse;
```

---

## switch vs. if-else

- `switch` → nur Gleichheit prüfen
- `if-else` → Bereiche oder komplexe Bedingungen

---

## Unterschied: kopfgesteuerte und fußgesteuerte Schleife

### Kopfgesteuerte Schleife (`while`)
- Bedingung wird **vor** dem Durchlauf geprüft
- Kann **0‑mal** laufen

```java
while (i <= z) {
    System.out.println(i);
    i++;
}
```

### Fußgesteuerte Schleife (`do-while`)
- Bedingung wird **nach** dem Durchlauf geprüft
- Läuft **mindestens 1‑mal**

```java
int x = 1;

do {
    System.out.println(x);
    x++;
} while (x <= 100);
```

---
---
---

## Mögliche Klausurfragen (Gesamter Stoff)

### 1) Was ist der Unterschied zwischen primitiven Datentypen und Objekten?
<details>
<summary>Antwort anzeigen</summary>

- Primitive Datentypen speichern direkt einen Wert.
- Objekte sind Instanzen von Klassen und werden über Referenzen verwaltet.

</details>

---

### 2) Wann verwendet man `==` und wann `.equals()`?
<details>
<summary>Antwort anzeigen</summary>

- `==` bei primitiven Datentypen.
- `.equals()` bei Objekten wie `String`.

</details>

---

### 3) Wann verwendet man `switch` statt `if-else`?
<details>
<summary>Antwort anzeigen</summary>

Wenn nur Gleichheit eines Wertes geprüft wird.

</details>

---

### 4) Unterschied zwischen `float` und `double`?
<details>
<summary>Antwort anzeigen</summary>

- `float`: 32 Bit, weniger genau.
- `double`: 64 Bit, genauer und Standard.

</details>

---

### 5) Unterschied zwischen kopf- und fußgesteuerter Schleife?
<details>
<summary>Antwort anzeigen</summary>

- `while`: Bedingung zuerst → kann 0‑mal laufen.
- `do-while`: Ausführung zuerst → läuft mindestens 1‑mal.

</details>

---

### 6) Was macht der ternäre Operator?
<details>
<summary>Antwort anzeigen</summary>

Er ersetzt eine einfache `if-else`-Zuweisung in einer Zeile.

</details>