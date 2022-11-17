<div align="center">
    <h1>Náborový plugin</h1>
    <strong>Plugin určený pro nábor nových vývojářů.</strong>
    <br><i>Verze 1.0</i><br>
</div>

# Obecné informace

### Pokud jsi dostal přístup k tomuto pluginu, tak ti gratulujeme, prošel jsi první částí náboru. Tím ale tvá cesta nekončí.

Tvým úkolem je splnit úkoly ze seznamu. Jsou dva typy úkolů:

- **Povinné** - musíš je splnit, aby jsi mohl být přijat do týmu. Pokud u některého z povinných úkolů bude větší neúspěšnost, bude uváženo o jeho nepovinnosti.
- **Bonusové** - můžeš je splnit, ale nemusíš. Pokud je splníš, budeš mít větší šanci na přijetí.

Plugin je na verzi **1.19.2**. Verze Javy je **17**. Doporučené IDE je **IntelliJ IDEA**, ale můžeš použít i jiné.

Práce s tímto pluginem má také několik pravidel:

- Je zakázáno šířit zdrojový kód dalším lidem.
- Je zakázáno kopírovat cizí kód jedna ku jedné, ale můžeš ho použít jako inspiraci.

Pokud bude zjištěno, že jsi pravidla náborového pluginu porušil, budeš z náboru vyřazen *a spapáme ti Haribo*.

Pokud nebudeš rozumět nějakému úkolu, budeš mít nějaké dotazy nebo najdeš chybu, napiš vývojářům na našem [Discordu](https://discord.rajce.pro/).

# Úkoly

Počet bodů za povinné úlohy je **26**.

Počet bodů za bonusové úlohy je přes **28**, je možné ale získat i více bodů (kvůli úlohám s dynamickým počtem bodů).

## Znalosti Javy

### Povinné úkoly

| Úkol                                                         | Počet bodů | Hotovo |
|--------------------------------------------------------------|------------|--------|
| Vyčisti kód od zbytečných importů                            | 1          | ✅      |
| Přidej základní Java dokumentaci k třídám a metodám          | 3          | ✅      |
| Oprav veškeré chyby v pluginu, které brání úspěšné kompilaci | 5          | ✅      |

### Bonusové úkoly

| Úkol                                                                                                 | Počet bodů  |
|------------------------------------------------------------------------------------------------------|-------------|
| Ukládej do MySQL databáze (z configu) čas při každém spuštění pluginu (v milisekundách či Timestamp) | 4           |
| Přidej alespoň 1 JUnit test                                                                          | 2           |
| Navrhni vylepšení kódu a přidej komentář, který vysvětluje změnu její důvod                          | 1 za každou |

## Znalosti Bukkit API

### Povinné úkoly

| Úkol                                                                  | Počet bodů | Hotovo |
|-----------------------------------------------------------------------|------------|--------|
| Přidej soubor plugin.yml                                              | 1          | ✅      |
| Oprav registraci a obsah všech listenerů a commandů                   | 1          | ✅      |
| Vypisuj hráčovi do chatu 'Jump!' zelenou barvou při každém jeho skoku | 2          | ✅      |
| Vytvoř příkaz /spawn, který teleportuje hráče na pozici z configu     | 3          |        |

### Bonusové úkoly

| Úkol                                                                            | Počet bodů | Hotovo |
|---------------------------------------------------------------------------------|------------|--------|
| Vypisuj hráčovi po připojení náhodně jednu z několika uvítacích zpráv v configu | 3          | ✅      |
| Vytvoř příkaz /raketa, který tě vystřelí do vesmíru (opravdu velký skok)        | 3          | ✅      |
| Vytvoř příkaz /kosmonaut, který nastaví hráči z argumentu na hlavu blok skla    | 3          | ✅      |

## Znalosti Gradle

*Poznámka: lze možné použít klasický Groovy gradle, ale Kotlin verze je doporučená.*

### Povinné úkoly

| Úkol                           | Počet bodů | Hotovo |
|--------------------------------|------------|--------|
| Změň verzi na 1.1              | 1          | ✅      |
| Přidej podporu Placeholder API | 1          | ✅      |
| Nastav kódování na UTF-8       | 2          | ✅      |

### Bonusové úkoly

| Úkol                                   | Počet bodů | Hotovo |
|----------------------------------------|------------|--------|
| Nastav verzi Javy na 17                | 2          | ✅      |
| Doplňuj verzi v plugin.yml automaticky | 2          |        |
| Přidej podporu shadowJar pluginu       | 2          |        |

## Znalosti Gitu

### Povinné úkoly

| Úkol                                           | Počet bodů | Hotovo |
|------------------------------------------------|------------|--------|
| Udělej fork originálního repozitáře            | 2          | ✅      |
| Vytvoř alespoň 3 smysluplné commity            | 2          | ✅      |
| Vytvoř pull request do originálního repozitáře | 2          | ⌛      |

### Bonusové úkoly

| Úkol                                                      | Počet bodů |
|-----------------------------------------------------------|------------|
| Založ novou branch s tvým herním jménem                   | 2          |
| Vytvoř tag s aktuální verzí pluginu (ve formátu v(verze)) | 2          |
| Podepiš commity pomocí GPG klíče                          | 3          |

# Přijetí
Pluginy, u kterých není možná jejich kompilace budou vyřazeny z náboru.

Přijati budou ti, kteří mají splněné všechny povinné úkoly, u kterých nebyla opožděně definována jejich nepovinnost.

Při maximálním počtu přijatých uchazečů budou prioritně přijati ti s nejvyšším počtem bodů. Pokud dojde ke stejnému počtu bodů, budou přijati lidé, kteří úkoly odevzdali dříve.