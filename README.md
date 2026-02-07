# ☕ Java Lernnotizen

Diese Notizen basieren auf den Vorlesungen im Modul **Programmieren**.  
Jedes Thema ist einklappbar, damit die Übersicht erhalten bleibt.

---

## 📚 Inhaltsverzeichnis
- Hello World
- Statische Methoden
- Primitive Datentypen
- Operatoren

---

<details>
<summary><h2>Hello World</h2></summary>

### Beispielcode

```java
public class D01_HelloWorld {
    public static void main(String[] args) {

        String text; // Deklaration

        text = "Hello World"; // Initialisierung

        System.out.println(text); // Ausgabe
    }
}
```

### Notizen
- Klassennamen beginnen mit einem Großbuchstaben.
- `main` ist die Startmethode eines Java-Programms.
- `void` bedeutet: kein Rückgabewert.

</details>

---

<details>
<summary><h2>Statische Methoden</h2></summary>

### Beispielcode

```java
public class D02_StaticMethods {

    public static void main(String[] args) {
        sayHello();
    }

    public static void sayHello() {
        System.out.println("Hello from static method");
    }
}
```

### Notizen
- `static` bedeutet: Methode gehört zur Klasse, nicht zum Objekt.
- Kann ohne Objekt aufgerufen werden.

</details>

---

<details>
<summary><h2>Primitive Datentypen</h2></summary>

### Übersicht

| Datentyp | Größe | Beispiel |
|----------|-------|----------|
| byte | 1 Byte | 42 |
| short | 2 Byte | 300 |
| int | 4 Byte | 1_000_000 |
| long | 8 Byte | 87_290_255_124 |
| float | 4 Byte | 3.14F |
| double | 8 Byte | 3.14 |
| char | 2 Byte | X |
| boolean | - | true |

### Notizen
- Primitive Datentypen sind fest in Java eingebaut.
- Java ist **statisch typisiert** → Datentyp muss angegeben werden.
- Eine Variable kann nur **einen Wert** speichern.
- Man kann Datentypen nicht verwenden, wenn sie nicht initialisiert sind.

### Beispiele

```java
public class D03_PrimitiveDataTypes {

    public static void main(String[] args) {

        int zahl = 10;
        double preis = 19.99;
        boolean istStudent = true;
        char buchstabe = 'A';

        float f = 0.1F;          // F nötig
        long l = 5_000_000_000L; // L nötig

        System.out.println(zahl);
        System.out.println(preis);
        System.out.println(istStudent);
        System.out.println(buchstabe);
        System.out.println(f);
        System.out.println(l);
    }
}
```

</details>

---

<details>
<summary><h2>Operatoren</h2></summary>

### Arithmetische Operatoren

| Operator | Bedeutung | Beispiel |
|----------|----------|----------|
| + | Addition | 5 + 3 = 8 |
| - | Subtraktion | 5 - 3 = 2 |
| * | Multiplikation | 5 * 3 = 15 |
| / | Division | 6 / 3 = 2 |
| % | Modulo (Rest) | 7 % 3 = 1 |

### Beispielcode

```java
public class D07_ArithmeticOperators {

    public static void main(String[] args) {

        int a = 10;
        int b = 3;

        System.out.println("Addition: " + (a + b));
        System.out.println("Subtraktion: " + (a - b));
        System.out.println("Multiplikation: " + (a * b));
        System.out.println("Division: " + (a / b));
        System.out.println("Modulo: " + (a % b));
    }
}
```

### Notizen
- Bei Ganzzahlen wird bei Division der **Rest abgeschnitten**.
- `%` gibt den Rest einer Division zurück.

</details>