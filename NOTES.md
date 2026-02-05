❗Scanner wichtig für Klausur


ich will github notizen markdown

ich habe # 📘 Programmierung – Vorlesung 1 (27.01)

---

## 🧭 Navigation

[![Hello World](https://img.shields.io/badge/Hello_World-blue)](#-hello-world)
[![Static Methods](https://img.shields.io/badge/Static_Methods-purple)](#-static-methods)
[![Primitive Datentypen](https://img.shields.io/badge/Primitive_Datentypen-green)](#-primitive-datentypen)
[![Notizen](https://img.shields.io/badge/Notizen-orange)](#-notizen)
[![Prüfung](https://img.shields.io/badge/Prüfungsrelevant-red)](#-prüfungsrelevant)
[![Zusammenfassung](https://img.shields.io/badge/Zusammenfassung-yellow)](#-zusammenfassung)

---

# 💻 Hello World

<details open>
<summary><b>Code Beispiel</b></summary>

```java
public class D01_HelloWorld {

    public static void main(String[] args) {

        String text; // Deklaration
        text = "Hello World"; // Initialisierung

        System.out.println(text); // Ausgabe
    }
}
```

</details>

---

### 📌 Hinweise

- Klassennamen beginnen mit Großbuchstaben
- `void` bedeutet → kein Rückgabewert
- `main()` ist der Programmeinstiegspunkt

---

# ⚙ Static Methods

<details>
<summary><b>Erklärung</b></summary>

➡ Methoden, die zur Klasse gehören und nicht zu einem Objekt.

Beispiel:

```java
public static void hallo() {
    System.out.println("Hallo");
}
```

</details>

---

# 🔢 Primitive Datentypen

<details open>
<summary><b>Übersicht</b></summary>

## Ganze Zahlen

| Datentyp | Größe | Beispiel |
|-----------|---------|-------------|
| byte | 1 Byte | 42 |
| short | 2 Byte | 300 |
| int | 4 Byte | 1_000_000 |
| long | 8 Byte | 87_290_255_124 |

---

## Gleitkommazahlen

| Datentyp | Größe | Beispiel |
|-----------|---------|-------------|
| float | 4 Byte | 3.141592F |
| double | 8 Byte | 3.141592653589793 |

---

## Zeichen

| Datentyp | Größe | Beispiel |
|-----------|---------|-------------|
| char | 2 Byte | 'X' |

---

## Wahrheitswerte

| Datentyp | Größe | Beispiel |
|-----------|---------|-------------|
| boolean | - | true |

</details>

---

### 📌 Regeln

- Variablen müssen initialisiert werden
- Primitive Datentypen speichern genau einen Wert
- Java ist statisch typisiert

---

### 💡 Beispiele

```java
float float1 = 0.1F; 
long long1 = 5_000_000_000L;
```

---

# 📝 Notizen

<details>
<summary><b>Grundlagen</b></summary>

### Datenobjekt
Container zum Speichern von Daten.

### Scope
Variablen sind nur innerhalb ihres Gültigkeitsbereichs sichtbar.

</details>

---

# 🚨 Prüfungsrelevant

<details>
<summary><b>Merken</b></summary>

✅ Unterschied primitive Datentypen  
✅ Bedeutung von `static`  
✅ Aufbau einer Java Klasse  
✅ Einstiegspunkt `main()`  
✅ Initialisierung von Variablen  

</details>

---

# 📚 Zusammenfassung

- Java ist objektorientiert und statisch typisiert
- Programme starten in der `main()` Methode
- Primitive Datentypen sind fest definiert
- Methoden strukturieren Programme

---

</details>

---



und das 

Java = stark typisierte Sprache!

- Datentypen sind vorzeichenbehaftet _was heißt das?_

- Symbol 9 ist was anderes als Wert 9, Symbol ist Abbildung (Hexa-Umrechnung)
- a ist größer wem Zahlenwert als A , siehe UTF-8 Umrechnungstabelle

#Wertigkeit von Datentypen:
    - implizierte _was heißt das?_


    - Wertverlust, wenn von komma datentyp zB double in ganzzahligen Datentyp zB int caste, 1.9 wird dann zu 1 (komma fliegt weg)

        double d2 = 1.9;
        float f2 = (float) d2; // ❗WICHTIG



ich will aber übersichtlich haben zB eine main seite wo ich alles sehe was es gitb und dann wenn ich zB auf primitive Datentypen klicke dann will nur alles nur zu primitve sehen und auf der seite soll es dann auch ein home button oder so geben. schreibe die codes welche files ich erstellen soll so dass es geil und übersichtlich ist