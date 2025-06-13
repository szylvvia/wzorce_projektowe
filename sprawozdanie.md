# Sprawozdanie z zajęć - Wzorce projektowe i techniki programistyczne

**Autorzy:** Korzeniewska Monika, Król Jakub, Krzysztoń Sylwia  
**Prowadzący:** dr inż. Piotr Kopniak

---

## Tydzień 2 - Wzorce projektowe kreacyjne

### Factory Pattern
**Lokalizacja:** `lab1Patterns/factory/`

**Implementacje:**
1. **SensorFactory** (`SensorFactory.java`, linie 8-17)
   - Metoda `createSensor(String type)` - tworzenie sensorów na podstawie typu
   - Produkty: `TemperatureSensor`, `HumiditySensor`, `PressureSensor`
   - Umożliwia tworzenie obiektów bez określania konkretnej klasy

2. **AlertFactory** (`AlertFactory.java`, linie 8-17)
   - Metoda `createAlert(String type)` - tworzenie alertów systemu monitoringu
   - Produkty: `HighTemperatureAlert`, `HighHumidityAlert`, `HighPressureAlert`
   - Centralizuje proces tworzenia obiektów alertów

3. **ReportTypeFactory** (`ReportTypeFactory.java`, linie 8-16)
   - Metoda `createReport(String type)` - tworzenie różnych formatów raportów
   - Produkty: `PdfReport`, `JsonReport`, `ExcelReport`
   - Enkapsuluje logikę tworzenia obiektów raportów

### Singleton Pattern
**Lokalizacja:** `lab1Patterns/singleton/`

**Implementacje:**
1. **DataSourceSingletonEagerInit** (`DataSourceSingletonEagerInit.java`, linie 8-16)
   - Eager initialization - obiekt tworzony podczas ładowania klasy
   - Pole statyczne `private static final DataSourceSingletonEagerInit dataSourceInstance`

2. **DataSourceSingletonStaticBlockInit** (`DataSourceSingletonStaticBlockInit.java`, linie 8-20)
   - Static block initialization z obsługą wyjątków
   - Blok statyczny `static { }` z try-catch dla lepszej kontroli

3. **DataSourceSingletonInnerStaticClassInit** (`DataSourceSingletonInnerStaticClassInit.java`, linie 11-15)
   - Inner static class initialization - lazy loading z thread safety
   - Klasa wewnętrzna `InnerStaticClassHelper` z instancją singletona

### Builder Pattern
**Lokalizacja:** `lab1Patterns/builder/`

**Implementacje:**
1. **MeasuringStation** (`MeasuringStation.java`, linie 8-24)
   - Klasa wewnętrzna `StationBuilder` z konstruktorem wymaganych parametrów
   - Metoda `build()` zwracająca obiekt `MeasuringStation`

2. **Notification** (`Notification.java`, linie 8-25)
   - Builder `NotificationBuilder` dla elastycznego tworzenia notyfikacji
   - Konstruktor buildera z wymaganym parametrem `message`

3. **Report** (`Report.java`, linie 25-53)
   - Fluent interface z metodami łańcuchowymi (`setPressure()`, `setTemperature()`, `setHumidity()`)
   - Opcjonalne parametry dodawane przez builder pattern

### Prototype Pattern
**Lokalizacja:** `lab1Patterns/prototype/`

**Implementacje:**
1. **SensorPrototype** (`SensorPrototype.java`, linie 8-22)
   - Implementuje `Cloneable`, metoda `clone()` z obsługą `CloneNotSupportedException`
   - Umożliwia efektywne tworzenie kopii sensorów

2. **MeasuringStationP** (`MeasuringStationP.java`, linie 15-22)
   - Metoda `clone()` zwracająca `MeasuringStationP`
   - Pozwala na klonowanie stacji z zachowaniem konfiguracji

3. **CountryPrototype** (`CountryPrototype.java`, linie 31-40)
   - Deep cloning listy miast z metodą `clone()`
   - Umożliwia tworzenie różnych wariantów bez wpływu na oryginalną listę

---

## Tydzień 3 - Wzorce strukturalne część 1

### Adapter Pattern
**Lokalizacja:** `lab2Patterns/adapter/`

**Implementacje:**
1. **TemperatureUnitAdapter** (`TemperatureUnitAdapter.java`, linie 13-35)
   - Konwersja między Celsius, Fahrenheit i Kelvin
   - Metody: `toFahrenheit()`, `toKelvin()`, `toRankine()` (nieobsługiwana)
   - Walidacja zakresu temperatury w konstruktorze

2. **MmHgPressureAdapter** (`MmHgPressureAdapter.java`, linie 13-31)
   - Konwersja ciśnienia z hPa na mmHg
   - Metoda `toMmHg()` z współczynnikiem konwersji 0.75006
   - Metoda `toPsi()` rzucająca `UnsupportedUnitConversionException`

3. **MphWindAdapter** (`MphWindAdapter.java`, linie 8-28)
   - Konwersja prędkości wiatru z km/h na mph
   - Walidacja zakresu prędkości (0-400 km/h)
   - Współczynnik konwersji 1.60934

### Bridge Pattern
**Lokalizacja:** `lab2Patterns/bridge/`

**Implementacje:**
1. **BridgePatternMessure** - oddziela abstrakcję stacji od implementacji sensorów
   - `MeasurementStationBridge` z `TemperatureSensorBridge`, `HumiditySensorBridge`
   - Klasy: `WeatherStationBridge`, `IndustrialStationBridge`, `MultiSensorStationBridge`

2. **BridgePatternCommunication** - różne moduły komunikacyjne
   - `CommunicatingMeasurementStation` z `HttpCommunication`, `MqttCommunication`
   - Metoda `measureAndSend()` łącząca pomiary z transmisją

3. **BridgePatternReport** (`BridgePatternReport.java`, linie 19-32)
   - `ReportableMeasurementStation` z `PdfReportGenerator`, `CsvReportGenerator`
   - Metoda `measureAndReport()` z obsługą `ReportGenerationException`

### Composite Pattern
**Lokalizacja:** `lab2Patterns/composite/`

**Implementacje:**
1. **MonitoringStationComposite** - hierarchiczna struktura stacji
   - `MeasurementStationCity`, `MeasurementStationRegion`
   - `CityComposite`, `CityMeasurementsGroup`

2. **SensorComposite** - kompozyt sensorów
   - `TemperatureSensorComposite`, `HumiditySensorComposite`, `PressureSensorComposite`
   - Wspólny interfejs dla pojedynczych i złożonych obiektów

### Decorator Pattern
**Lokalizacja:** `lab2Patterns/decorator/`

**Implementacja:**
- **DecoratorPatternDecorator** - dekoratory dla sensorów
- Rozszerzanie funkcjonalności sensorów bez modyfikacji oryginalnych klas
- Dynamiczne dodawanie nowych zachowań w czasie wykonania

---

## Tydzień 4 - Wzorce strukturalne część 2

### Facade Pattern
**Lokalizacja:** `lab3Patterns/facade/`

**Implementacje:**
1. **AlertFacade** - uproszczony interfejs dla alertów
   - `PushNotificationAlert`, `EmailAlert`
   - Ukrywa złożoność systemu alertów

2. **ReportFacade** - fasada generowania raportów
   - `ReportGeneratorFacade`, `PdfReportGeneratorFacade`, `CsvReportGeneratorFacade`
   - Jednolity interfejs dla różnych formatów

3. **MeasurementFacade** - fasada pomiarów
   - `MeasurementFacade`, `TemperatureSensorFacade`, `HumiditySensorFacade`, `PressureSensorFacade`
   - Upraszcza interakcję z systemem pomiarowym

### Proxy Pattern
**Lokalizacja:** `lab3Patterns/Proxy/`

**Implementacje:**
1. **P1** - podstawowy proxy dla stacji pomiarowej
   - `RealMeasuringStation`, `MeasuringStationP1`
   - Kontrola dostępu do rzeczywistego obiektu

2. **P2** - proxy z zabezpieczeniami
   - `SensitiveMeasuringStation`, `MeasuringStationP2`
   - Dodatkowa warstwa bezpieczeństwa

3. **P3** - zdalny proxy
   - `RemoteMeasuringStation`, `RemoteMeasuringStationProxy`
   - Reprezentuje obiekt w zdalnej lokalizacji

### Flyweight Pattern
**Lokalizacja:** `lab3Patterns/flyweight/`

**Implementacje:**
1. **flyweight1** (`EnvironmentalDetailsFactory.java`, linie 9-25)
   - `EnvironmentalFlySensorDetails` dla sensorów środowiskowych
   - Fabryka `EnvironmentalDetailsFactory` z HashMap cache
   - `DigitalSensorTester` demonstrujący efektywność pamięciową

2. **flyweight2** (`RepeatFlyReportDataFactory.java`, linie 10-20)
   - `RepeatFlyReportData` dla raportów okresowych
   - Enum `ReportType` (MONTHLY, WEEKLY, DAILY)
   - Współdzielenie danych raportów między instancjami

3. **flyweight3** (`DangerFlyAlertDetailsFactory.java`, linie 10-22)
   - `DangerFlyAlertDetails` dla alertów niebezpieczeństwa
   - Factory z typami alertów (LOW, MEDIUM, HIGH)
   - `AlertTester` pokazujący oszczędność pamięci

---

## Tydzień 5 - Wzorce behawioralne część 1

### Command Pattern
**Lokalizacja:** `lab4Patterns/command/`

**Implementacje:**
- `StartMeasurementCommand`, `StopMeasurementCommand` - komendy dla stacji pomiarowej
- `AlertManager`, `AlertCommandInvoker` - invoker i receiver
- `DataLogger` - rejestrowanie komend

### Iterator Pattern
**Lokalizacja:** `lab4Patterns/iterator/`

**Implementacje:**
- `AlertHistory`, `AlertHistoryIterator` - iteracja przez historię alertów
- `MyIterator` - własna implementacja interfejsu Iterator
- Bezpieczne przeglądanie kolekcji bez ujawniania struktury

### Interpreter Pattern
**Lokalizacja:** `lab4Patterns/interpreter/`

**Implementacje:**
1. **interpreter1** - podstawowe wyrażenia
   - `EqualToExpression`, `LessThan` - interpretery porównań
   - `Context` - kontekst interpretacji

3. **interpreter3** - analiza anomalii ciśnienia
   - `PressureAnomalyChecker`, `AbstractExpression`
   - Interpretacja złożonych wyrażeń pomiarowych

### Mediator Pattern
**Lokalizacja:** `lab4Patterns/mediator/`

**Implementacje:**
1. **station** - mediator stacji pomiarowej
   - `StationMediatorImpl`, `SensorComponentStation`, `ControllerComponent`
   - Centralizacja komunikacji między komponentami

2. **calibration** - mediator kalibracji
   - `CalibrationMediatorImpl`, `SensorComponentCalibration`, `StationComponent`
   - Zarządzanie procesem kalibracji sensorów

### Memento Pattern
**Lokalizacja:** `lab4Patterns/memento/`

**Implementacje:**
1. **Alert** - przywracanie stanu alertów
   - `AlertSystem`, `AlertCaretaker` - zapisywanie i przywracanie
   - Historia stanów systemu alertów

2. **Sensor** - memento kalibracji sensorów
   - `SensorMemento`, `SensorCalibrationCaretaker`, `SensorCalibrationMemento`
   - Przywracanie poprzednich ustawień kalibracji

3. **Station** - stan stacji pomiarowej
   - `MeasuringStationMemento`, `StateHistoryCaretaker`, `StationStateMemento`
   - Zarządzanie historią stanów stacji

---

## Tydzień 6 - Wzorce behawioralne część 2

### Observer Pattern
**Lokalizacja:** `lab5Patterns/observer/`

**Implementacje:**
- `Subject`, `HumidityObserver` - obserwator zmian wilgotności
- Powiadamianie obserwatorów o zmianach stanu
- Luźne powiązanie między obiektem obserwowanym a obserwatorami

### State Pattern
**Lokalizacja:** `lab5Patterns/state/`

**Implementacje:**
1. **SensorState** - stany sensora
   - `SensorContext`, `OperationalState` - kontekst i stany operacyjne
   - Zmiana zachowania w zależności od stanu

2. **StationState** - stany stacji
   - `StationState`, `MaintenanceState` - różne stany stacji pomiarowej
   - Enkapsulacja zachowań specyficznych dla stanu

### Strategy Pattern
**Lokalizacja:** `lab5Patterns/strategy/`

**Implementacje:**
1. **AlertStrategy** - strategie alertów
   - `StatisticalAlertStrategy` - algorytmy analizy statystycznej
   - Wymienność algorytmów alertowania

2. **DataAggregationStrategy** - agregacja danych
   - `DataAggregator`, `MaximumAggregationStrategy`, `DataAggregationStrategy`
   - Różne metody przetwarzania danych pomiarowych

3. **DataTransmissionStrategy** - transmisja danych
   - `TransmissionStrategy`, `MqttTransmissionStrategy`, `WebSocketTransmissionStrategy`
   - Wymienne protokoły komunikacji

### Template Method Pattern
**Lokalizacja:** `lab5Patterns/template/`

**Implementacje:**
- Metody szablonowe dla procesów pomiarowych
- Definiowanie szkieletu algorytmu z możliwością przesłaniania kroków
- Kod wspólny w klasie bazowej, szczegóły w podklasach

### Visitor Pattern
**Lokalizacja:** `lab5Patterns/visitor/`

**Implementacje:**
1. **visitor1** - `VisitorTester1` - podstawowy visitor
2. **visitor2** - `UrbanStation`, `VisitorTester2` - visitor dla stacji miejskich
3. **visitor3** - `Country`, `AlertVisitable`, `AlertVisitor` - visitor dla alertów
   - Dodawanie nowych operacji bez modyfikacji istniejących klas
   - Rozdzielenie algorytmów od struktury danych

---

## Tydzień 7-8 - Zasady SOLID

### Single Responsibility Principle (SRP)
**Lokalizacja:** `lab6/srpSensor/`, `lab6/srpMemento/`

**Implementacje:**
1. **srpSensor** - podział odpowiedzialności sensora
   - `HumiditySensorController` - logika kontroli
   - `HumiditySensorData` - dane sensora  
   - `HumiditySensorDisplay` - wyświetlanie
   - `ISensorController`, `ISensorDisplay` - interfejsy segregujące odpowiedzialności

2. **srpMemento** - separacja funkcji memento
   - `AlertSystem` - system alertów
   - `AlertMemento` - stan do zapisania
   - Każda klasa ma jedną, dobrze zdefiniowaną odpowiedzialność

### Open/Closed Principle (OCP)
**Lokalizacja:** `lab6/ocpAbstract/`, `lab6/ocpData/`

**Implementacje:**
1. **ocpAbstract** - rozszerzalność przez abstrakcję
   - `CO2Warning`, `DataLogger`, `FileLogger` - klasy bazowe
   - Otwarte na rozszerzenia, zamknięte na modyfikacje

2. **ocpData** - rozszerzenia przez nowe klasy danych
   - `SensorThreshold`, `ThresholdChecker` - sprawdzanie progów
   - Dodawanie nowych typów bez modyfikacji istniejącego kodu

3. **ocpData3** - formattery pomiarów
   - `MeasurementFormatter_ocpData3`, `JsonFormatter_ocpData3`, `ConsoleOutput_ocpData3`
   - Nowe formatery dodawane bez zmiany istniejącej logiki

### Liskov Substitution Principle (LSP)
**Lokalizacja:** `lab7/liskov/`

**Implementacje:**
1. **liskovK** - `LiskovTester`, `MonitoringStation`, `WifiTransmitter`
   - Podklasy można zastąpić klasami bazowymi bez naruszenia funkcjonalności

2. **liskovM** - `MeasurementStation_liskov`, `TemperatureSensorLiskov`
   - Zachowanie zgodne z kontraktem klasy bazowej

3. **liskovS** - `City`, `Report`, `Statistic` 
   - Wszystkie implementacje spełniają oczekiwania klientów

### Dependency Inversion Principle (DIP)
**Lokalizacja:** `lab7/dip/`

**Implementacje:**
1. **dipK** - `DependencyInversionTester`, `AlertService`, `MonitoringService`
   - Zależność od abstrakcji, nie konkretnych implementacji

2. **dipM** - `MeasurementManager`, `AbstractDataSource`, `FileDataSource`
   - `IMeasurementProcessor`, `IReportGenerator` - interfejsy abstrakcyjne
   - `AverageProcessor` - konkretna implementacja procesora

3. **dipS** - system raportowania zgodny z DIP
   - `BasicReport` (`BasicReport.java`) - konkretna implementacja generatora
   - `ReportGenerator` - abstrakcja dla różnych typów raportów
   - `ISensor` - interfejs dla sensorów zgodny z DIP

### Interface Segregation Principle (ISP)
**Lokalizacja:** `lab7/isp/`

**Implementacje:**
1. **ispK** - `InterfaceSegregationTester`, `BasicTemperatureSensor`
   - `SensorInterface`, `AlertInterface` - małe, specjalistyczne interfejsy
   - `SmsAlert`, `EmailAlert` - implementacje specjalistycznych interfejsów

2. **ispM** - `InterfaceSegregationTest` (`InterfaceSegregationTest.java`, linie 13-32)
   - `IReadSensor`, `ICalibratable`, `IResettable` - segregowane interfejsy
   - `CSVLogger` - implementacja konkretnego interfejsu logowania
   - `ISensorFile/` - pliki z podziałem interfejsów sensorów
   - `IDataExporterFile/` - segregacja eksportu danych

3. **ispS** - `Tester` - demonstracja segregacji interfejsów
   - `isp1/` - raporty: `BasicCSVReport`, `BasicJSONReport`, `BasicPDFReport`
   - `isp2/` - statystyki: `DailyTemperatureStats`, `HourlyAirQualityStats` 
   - `isp3/` - stacje: `AdvancedAirStation`, `AdvancedWaterStation`, `BasicSoilStation`

---

## Tydzień 9 - Programowanie czyste (Clean Code)

**Zastosowane praktyki:**
1. **Czytelne nazwy** - wszystkie klasy i metody mają opisowe nazwy (np. `TemperatureUnitAdapter`, `generateReport()`)
2. **Małe metody** - metody skupione na jednej funkcjonalności (np. metody konwersji w adapterach)
3. **Komentarze opisujące cel** - każda klasa ma komentarz opisujący tydzień i przeznaczenie
4. **Obsługa błędów** - własne wyjątki (`InvalidMeasurementException`, `OutOfRangeMeasurementException`)
5. **Spójne formatowanie** - konsystentny styl kodowania w całym projekcie
6. **Separacja odpowiedzialności** - podział na pakiety według wzorców i funkcjonalności

---

## Tydzień 10 - Programowanie funkcyjne

**Lokalizacja:** `lab8/`

### Interfejsy funkcyjne i wyrażenia lambda
**Implementacje:**

1. **example1** - `FunctionalInterfacesDemo.java`
   - `DataValidator` - walidacja wartości z wyrażeniem lambda
   - `AlertFormatter` - formatowanie alertów (linie 19-21)
   - `SensorAction` - akcje sensora z lambda expressions

2. **example2** - `Tester.java`
   - `WeatherChecker` - sprawdzanie warunków pogodowych (linie 10-26)
   - `WindConverter` - konwersja jednostek wiatru z lambda (linie 34-37)
   - Interfejsy funkcyjne dla analizy warunków meteorologicznych

3. **example3** - `CustomFunctionalInterfacesDemo.java`
   - `StationLogger` - logging z lambda (linie 8-9)
   - `StationCalculator` - obliczenia średniej (linie 13-16)
   - `StationFilter` - filtrowanie nazw stacji (linie 23)

### Predicate i Function
**Implementacje:**

1. **PredicateFunctionDemo** (`PredicateFunctionDemo.java`)
   - `Predicate<Double> isDangerousTemperature` - sprawdzanie niebezpiecznej temperatury (linie 10-11)
   - `Function<Double, String> dangerLevel` - kategoryzacja poziomu zagrożenia (linie 12-16)
   - `Predicate<Date> isDateInFuture` - sprawdzanie dat przyszłych (linie 28)

2. **PredicateFunctionExample** (`PredicateFunctionExample.java`)
   - `Predicate<Integer> isLowPressure` - analiza ciśnienia (linie 12)
   - `Function<Integer, String> pressureCategory` - kategoryzacja ciśnienia (linie 13-17)

### Stream Processing
**Implementacje:**

1. **StreamProcessingDemo** (`StreamProcessingDemo.java`, linie 19-31)
   - Filtrowanie temperatur powyżej 30°C: `temperatures.stream().filter(t -> t > heatingTemp)`
   - Obliczanie średniej wilgotności: `humidities.stream().mapToDouble(Double::doubleValue).average()`
   - Mapowanie nazw stacji: `stationNames.stream().map(String::toUpperCase)`

2. **AdvancedStreamProcessing** (`AdvancedStreamProcessing.java`, linie 16-30)
   - Znajdowanie maksymalnego ciśnienia: `pressureReadings.stream().max(Integer::compare)`
   - Zliczanie dni z silnym wiatrem: `windSpeeds.stream().filter(ws -> ws > wind).count()`
   - Sortowanie lokalizacji: `locations.stream().sorted()`

---

## Tydzień 11 - Programowanie aspektowe (AOP)

**Lokalizacja:** `lab9/`

### AspectJ1 - Podstawowe aspekty
**Implementacje:**

1. **LoggingAspect** (`LoggingAspect.java`, linie 14-19)
   - `@Before` - logowanie przed wywołaniem metod `get*()`
   - `@After` - logowanie po zakończeniu pobierania danych
   - Pointcut: `execution(* com.example.monitoringSystem.lab9.AspectJ1.MeasurementStation.get*(..))`

2. **ValidationAspect** (`ValidationAspect.java`, linie 11-20)
   - `@AfterReturning` - walidacja temperatury po zwróceniu wyniku
   - Sprawdzanie zakresu temperatury (-50°C do 60°C)
   - Automatyczne wykrywanie nieprawidłowych wartości

3. **ExecutionTimeAspect** (`ExecutionTimeAspect.java`, linie 8-15)
   - `@Around` - pomiar czasu wykonania metod pomiarowych
   - `ProceedingJoinPoint` dla kontroli wykonania
   - Logowanie czasu w milisekundach

### AspectJ2 - Aspekty zaawansowane
**Implementacje:**

1. **TemperatureAnomalyAspect** (`TemperatureAnomalyAspect.java`, linie 18-27)
   - `@AfterReturning` - wykrywanie anomalii temperaturowych
   - Próg wykrywania: 50.0°C
   - Lista aktywnych alertów z timestampami

2. **ConfigChangeAspect** (`ConfigChangeAspect.java`, linie 19-29)
   - `@After` - śledzenie zmian konfiguracji
   - Zapis do pliku `config_changes.log`
   - Mapa zmian z timestampami

3. **SensorRefreshAspect** (`SensorRefreshAspect.java`, linie 18-24)
   - `@After` - automatyczne odświeżanie sensorów
   - Logowanie czasu odświeżenia
   - Lista wszystkich odświeżeń

### AspectJ3 - Aspekty dla raportów
**Implementacje:**

1. **ExecutionTimeAspect** (`ExecutionTimeAspect.java`, linie 12-19)
   - `@Around` - pomiar czasu generowania raportów
   - Logowanie startu i końca generowania
   - Obliczanie całkowitego czasu trwania

2. **CountGeneratedReportsAspect** (`CountGeneratedReportsAspect.java`, linie 12-16)
   - `@After` - liczenie wygenerowanych raportów
   - Automatyczne inkrementowanie licznika
   - Wyświetlanie bieżącej liczby raportów

3. **CheckIsMeasurmentGeneratedAspect** (`CheckIsMeasurmentGeneratedAspect.java`, linie 21-35)
   - `@Before` - walidacja przed wysłaniem raportu
   - Sprawdzanie czy pomiary zostały wygenerowane
   - Refleksja do dostępu do prywatnych pól

**Konfiguracja:** `META-INF/aop.xml` - definicja aspektów dla AspectJ

---

## Tydzień 13 - Testy jednostkowe

**Lokalizacja:** `src/test/java/com/example/monitoringSystem/`

### Testy wzorców projektowych

1. **TestK** - testy wzorca Adapter
   - `TemperatureUnitAdapterTest.java` - test konwersji jednostek temperatury
   - Metody: `testCelsiusToFahrenheit()`, `testCelsiusToKelvin()`, `testNegativeCelsius()`
   - Weryfikacja precyzji: `assertEquals(97.88, adapter.toFahrenheit(), 0.01)`

2. **TestS** - testy wzorca Adapter dla ciśnienia
   - `MmHgPressureAdapterTest.java` - test konwersji ciśnienia z hPa na mmHg
   - Testy wyjątków: `testNegativePressureThrowsException()`, `testPressureExceedsMaxRangeThrowsException()`
   - Test precyzji: `assertEquals(759.99, adapter.toMmHg(), 0.01)`

### Testy zasad SOLID

1. **TestispM** - testy Interface Segregation Principle
   - `CSVLoggerTest.java` - test implementacji loggera CSV zgodnie z ISP
   - Wykorzystanie `ByteArrayOutputStream` do przechwytywania wyjścia
   - Weryfikacja poprawności formatowania CSV

2. **TestdipM** - testy Dependency Inversion Principle
   - `AverageProcessorTest.java` - test procesora średniej zgodnie z DIP
   - `ConsoleReportGeneratorTest.java` - test generatora raportów konsoli
   - Testowanie różnych wartości: podstawowe, zero, ujemne, duże liczby

### Struktura testów
- Wszystkie testy używają JUnit 5 (`@Test`, `@BeforeEach`, `@AfterEach`)
- Zastosowanie asercji: `assertEquals()`, `assertTrue()`, `assertThrows()`
- Testy wyjątków dla nieprawidłowych danych wejściowych
- Testy precyzji dla obliczeń matematycznych
- Izolacja testów z przywracaniem stanu początkowego

---

## Podsumowanie

Projekt demonstruje kompleksowe zastosowanie wzorców projektowych i nowoczesnych technik programistycznych:

- **23 wzorce projektowe** zaimplementowane w pełni funkcjonalnym systemie monitoringu
- **Wszystkie zasady SOLID** z praktycznymi przykładami zastosowania
- **Programowanie funkcyjne** z wykorzystaniem lambda expressions, Stream API i interfejsów funkcyjnych
- **Programowanie aspektowe (AOP)** z AspectJ do separacji zagadnień przekrojowych
- **Testy jednostkowe** pokrywające kluczowe funkcjonalności z weryfikacją poprawności implementacji

Każda implementacja jest udokumentowana komentarzami wskazującymi tydzień zajęć i konkretny wzorzec/technikę, co ułatwia nawigację i zrozumienie struktury projektu.

