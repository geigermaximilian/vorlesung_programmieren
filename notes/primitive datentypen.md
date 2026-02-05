# 🔢 Primitive Datentypen

[🏠 Zur Lernübersicht](../NOTES.md)

---

## Zugehöriger Code

👉 `src/main/java/main/D03_PrimitiveDataTypes.java`  
👉 `src/main/java/main/D05_TypeCasting.java`

---

## Überblick

Primitive Datentypen speichern genau **einen Wert**.

Java ist eine **stark typisierte Sprache** → jede Variable benötigt einen festen Datentyp.

---

## Ganze Zahlen

| Datentyp | Größe | Beispiel |
|-----------|------------|-------------|
| byte | 1 Byte | 42 |
| short | 2 Byte | 300 |
| int | 4 Byte | 1_000_000 |
| long | 8 Byte | 87_290_255_124 |

---

## Gleitkommazahlen

| Datentyp | Größe | Beispiel |
|-----------|------------|-------------|
| float | 4 Byte | 3.14F |
| double | 8 Byte | 3.141592653589793 |

---

## Zeichen

| Datentyp | Größe | Beispiel |
|-----------|------------|-------------|
| char | 2 Byte | 'X' |

---

## Wahrheitswerte

| Datentyp | Beispiel |
|-----------|-------------|
| boolean | true |

---

## Vorzeichenbehaftet

Zahlen können positiv oder negativ sein.

---

## Symbol vs Zahlenwert

Ein Zeichen besitzt einen numerischen Wert.

Beispiel:

- `'9'` ≠ `9`
- `'a'` besitzt anderen Zahlenwert als `'A'`
- Speicherung erfolgt über UTF / Unicode Tabellen

---

## Wertigkeit von Datentypen

### Implizite Umwandlung

Automatische Typanpassung bei kompatiblen Datentypen.

---

## Type Casting

```java
double d = 1.9;
int i = (int) d;
