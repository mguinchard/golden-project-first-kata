# golden-project-first-kata

### Initial method
```java
    public float divideNumberPositive(float nbr, float divisor)
    {
        float result;

        if(nbr < 0 || divisor < 0)
        {
            result = -1;
        }
        else if (divisor == 0)
        {
            result = 0;
        }
        else
        {
            result = nbr / divisor;
        }

        return result;
    }
```


### Etape 1
Créez des méthodes de test qui appellent la fonction que vous souhaitez modifier avec plusieurs paramètres (pour tester le plus grand nombre de cas possibles),

```java
    @ParameterizedTest
    @MethodSource("divideNumberPositive_data")
    void divideNumberPositive_divide(
        float nbr,
        float divisor,
        float expected
        ) {
        assertThat(calculator.divideNumberPositive(nbr, divisor)).isEqualTo(expected);
        }
        
    static Stream<Arguments> divideNumberPositive_data() {
        return Stream.of(
            Arguments.of(10, 10, 1),
            Arguments.of(0, 1, 0),
            Arguments.of(-10, -120, -1),
            Arguments.of(10, 0, 0)
        );
    }
```

### Etape 2
Stockez chaque résultat d’appel de vos méthodes de test dans des fichiers avec leurs paramètres
```text
    10/10    = 1
    0/1      = 0
    -10/-120 = -1
    10/0     = 0
```

### Etape 3
Créez une nouvelle méthode de test qui récupère chacun des fichiers créés ultérieurement et exécutez la fonction initialement réalisée lors du premier test (avec les paramètres contenus dans le fichier)

```java
    static Stream<Arguments> divideNumberPositive_data_etape3() {
        return Stream.of(
            Arguments.of(10, 10, 1),
            Arguments.of(0, 1, 0),
            Arguments.of(-10, -120, -1),
            Arguments.of(10, 0, 0)
        );
    }
    
    @ParameterizedTest
    @MethodSource("divideNumberPositive_data_etape3")
    void divideNumberPositive_etape3(
        float nbr,
        float divisor,
        float expected
    ) {
        assertThat(calculator.divideNumberPositive(nbr, divisor)).isEqualTo(expected);
    }

```

### Etape 4
Comparez et vérifiez que le résultat de ce test est identique à ceux des fichiers

```text
divideNumberPositive_nbr_greaterOrEquals_0_and_divisor_greater_0_should_return_real_divide(float, float, float)
[1] nbr=10, divisor=10, expected=1
[2] nbr=0, divisor=1, expected=0
[3] nbr=-10, divisor=-120, expected=-1
[4] nbr=10, divisor=0, expected=0

divideNumberPositive_nbr_greaterOrEquals_0_and_divisor_greater_0_should_return_real_divide_etape3(float, float, float)
[1] nbr=10, divisor=10, expected=1
[2] nbr=0, divisor=1, expected=0
[3] nbr=-10, divisor=-120, expected=-1
[4] nbr=10, divisor=0, expected=0

```


### Etape 5
Modifiez le code source de la méthode une fois avoir obtenu des résultats identiques




### Etape 6
Relancez la méthode de test écrite à l’étape 3

### Etape 7
Si le résultat de votre appel est toujours identique au résultat contenu dans votre fichier, le traitement de la méthode n’a pas été modifié. Dans ce cas, modifiez votre méthode jusqu’à passage du test au vert