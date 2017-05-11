public class Text {
  //region Immutabillity Classes: Money
    /*
        Grundlagen - Geld
        Für die Darstellung von kaufmännischen Prozessen im Unternehmen sollen die grundlegenden Klassen erstellt werden. Die zu erstellenden Klassen sollen
        dabei folgende Aspekte abdecken:

        Geldbeträge
        Geldbeträge sollen darstellbar sein. Die typischen Anwendungsfälle sollen damit darstellbar sein:

        Addieren / Subtrahieren unterschiedlicher Geldbeträge
        Multiplikation von Beträgen mit frei gewählten Faktoren
        Unterschiedliche Währung müssen *nicht* berücksichtigt werden - d.h. dieser Aspekt kann komplett ignoriert werden.

        Zusatz: Bitte vergessen Sie nicht, dass Fließkommazahl-Operationen (so gut wie) immer mit Rundungsfehlern verbunden sind. Vermeiden Sie daher -
        wenn irgend möglich - die Darstellung von Geldbeträgen als Flieskomma-Zahl
     */
  //endregion

  //region Builder: Classes: Invoice, LineItem, InvoiceBuilder

    /*
        ls Erweiterung zur ersten Übungsaufgabe sollen nun folgende Klassen hinzugefügt werden:

        Als gutes Unternehmen ist es uns natürlich ein großes Anliegen regelmäßig und in großer Höhe Rechnungen zu stellen. Dafür möchten wir unsere Software vorbereiten.

        Erstellen Sie folgende Klassen:

        Invoice
        Diese Klasse repräsentiert eine Rechnung. Wir werden diese Klasse Schritt für Schritt erweitern. In erster Iteration ist diese Klasse sehr einfach aufgebaut und enthält nur eine Liste von LineItem(s).

        Außerdem enthält die Invoice-Klasse eine Methode um die Gesamtsumme über alle Zeilen zu berechnen.

        Ansonsten enthält die Rechnung keine Funktionalität. Diese wird dann in den nächsten Übungsaufgaben hinzugefügt.

        LineItem
        Entspricht der Zeile einer Rechnung. Auch diese Zeile wird möglichst einfach gehalten und enthält nur folgende Properties:

        Beschreibung: Enthält die Beschreibung eines Artikels
        Menge: Entspricht der Anzahl die von diesem Artikel bestellt ist
        Preis: Entspricht dem Preis eines einzelnen Artikels
        Außerdem erhält ein LineItem noch die Möglichkeit die Summe zu berechnen (Menge * Preis).

        InvoiceBuilder
        Erstellen Sie einen Builder, der in der Lage ist Invoice(s) zu erstellen.

        Unit-Tests

        Um die Korrektheit der Funktionen zu belegen, sind ausreichend Unit-Tests zu erstellen.
     */
  //endregion

  //region Abstract Factory Classes: BackdateInvoiceHeader, DefaultinvoiceHeader, Invoice, InvoiceHeader, InvoiceHeaderFactory, Receiver
    /*
        Nachdem wir nun in der Lage sind (sehr rudimentäre) Rechnungen zu erstellen, möchten wir diese Funktionalität etwas ausbauen. Insbesondere benötigt natürlich jede Rechnung einen Rechnungskopf mit

        Datum
        Rechnungs-Nummer
        Empfänger

        Da die Software unter anderem auch für die GEZ eingesetzt werden soll, benötigen wir eine besondere Funktionalität:
        Unter besonderen Umständen soll die Rechnung um 10 Tage zurück datiert werden können.

        Vorarbeiten
        Erstellen Sie bitte die nachfolgend beschriebenen Klassen und integrieren Sie diese in die vorhanden Klassen (Invoice) und natürlich den Builder. Passen Sie die Tests an, wo es notwendig sein sollte.

        Receiver
        Der Rechnungsempfänger hat zwei Felder:

        String: name
        String: address
        InvoiceHeader
        Der Rechnungskopf enthält

        Rechnungsdatum
        Rechnungs-Nummer
        Rechnungs-Empfänger (Receiver)
        Abstract-Factory-Pattern
        Führen Sie das Abstract-Factory-Pattern für die Erstellung der InvoiceHeader ein. Es soll dabei zwei Implementierungen geben:

        Default: Erstellt einen "normalen" Header mit dem aktuellen Datum. Die Rechnungs-Nummer wird automatisch hoch gezählt
        Backdate: Erstellt einen zurück datierten Header mit einem 10 Tage in der Vergangenheit liegenden Datum. Die erstliche Funktionalität entspricht der Default-Factory.
        Die Factories müssen dann an geeigneter Stelle eingeführt werden. Bestehende Tests sind eventuell anzupassen.
    */
  //endregion

  //region Strategy Classes: FlatSalesTaxCalc, ReducedSalesTaxCalculator, SalesTaxCalculator
    /*
        Grundlagen
        Der Staat möchte natürlich auch seinen Teil abhaben. Deshalb bleibt uns nichts anderes übrig als eine Mehrwertsteuer-Berechnung einzubauen.

        Als international tätiges Unternehmen bleibt es uns nicht erspart für andere Länder und Sitten voraus zu planen. Aus diesem Grund wollen wir für die Berechnung der Mehrwertsteuer das Strategy-Pattern verwenden.

        Strategy-Pattern
        Erweitern Sie die Invoice-Klasse um eine Strategie zur Berechnung der SalesTax. Die Invoice-Klasse nutzt diese Strategie und stellt Methoden zur Berechnung der Netto- und Brutto-Rechnungssumme zur Verfügung.

        Überlegen Sie sich wer wann und wie sinnvollerweise die Strategie setzen kann.

        Strategies
        Erstellen Sie zwei Strategie-Implementierungen:

        Eine "einfache" Implementierung, die mit einem einzigen Prozentsatz für die gesamte Rechnung arbeitet
        Eine komplexere Implementierung, die auf Basis der einzelnen LineItems entweder mit dem normalen oder einem reduzierten Mehrwertsteuersatz rechnet.
        Sie dürfen sich selbst ein Kriterium ausdenken, anhand dessen die Fälle unterschieden werden. (z.B. anhand eines String-Vergleichs?)
     */
  //endregion

  //region Composite Classes: HasValue, HasValueParent, Article, Journal,
    /*
        Article
        Aktuell enthält ein LineItem eine Beschreibung und einen Preis.
        Wir möchten diese Werte gerne in eine Klasse "Article" extrahieren. Damit können wir diese Artikel bequem wieder verwenden und zentral verwalten.

        --> Article enthält Beschreibung und Preis

        --> LineItem enthält dann einen Article

        Journal
        Zusätzlich möchten wir die Klasse Journal einführen, welche ein Protokoll über die erstellten Rechnungen führt. In dieses Journal können im Laufe der Zeit weitere Rechnungen eingetragen werden.

        Composite Pattern
        Wir haben ja nun eine Hierarchie von Objekten, welche einen Preis haben. Erstellen Sie nun ein Interface, welches diese Gemeinsamkeit abstrahiert.Die entsprechenden Klassen sollen dieses Interface implementieren.

        Vermutlich ist es sinnvoll für Eltern-Objekte die eine Liste von Kind-Objekten enthalten, eine abstrakte Basis-Klasse mit der gemeinsamen Funktionalität zu erstellen.

        PS: Journal ist veränderlich, Invoice soll dagegen immutable sein. Diese Klassen können trotzdem von der gleichen Basis-Klasse erben, ohne diese Unterscheidung aufgeben zu müssen. Falls Sie damit Probleme haben sollten, ist es vermutlich einfacher, zunächst Journal auch mutable zu machen. Eventuell wird Ihnen danach einfallen, wie Sie dieses Problem lösen könnten.
     */
  //endregion

  //region Visitor PrettyPrinter, InvoiceFinder
    /*
        Wir erweitern unser Beispiel.

        In der letzten Aufgabe haben wir ja ein Journal eingeführt. In diese Aufgabe wollen wir dieses Journal mit Hilfe des Visitor-Patterns analysieren:

        Darstellung in Braum-Struktur
        Stellen Sie mit Hilfe des Visitor-Patterns die Baum-Struktur dar. Eine Beispiel-Ausgabe könnte so aussehen:

        --------------------------
        daJournal
        --------------------------
          1 - Markus Mustermann
            5 Artikel A à 5.07 €
            7 Artikel B à 4.07 €
            --------------------------
            Net: 53.84 €
            Tax: 10.23 €
            Gross: 64.07 €
          1 - Paula Panther
            1 Artikel C à 3.07 €
            400 Artikel B à 4.07 €
            --------------------------
            Net: 1,631.07 €
            Tax: 309.90 €
            Gross: 1,940.97 €
        --------------------------
        1,684.91 €

        Die Baumstruktur können Sie beispielsweise sehr gut durch die Einrückung darstellen.

        Finden von Rechnungen, die bestimmte Artikel enthalten
        Erstellen Sie einen Visitor, welcher einen (Teil-)Baum durchläuft und alle Rechnungen findet, die einen bestimmten Artikel beinhalten.
     */
  //endregion

  //region Decorator
    /*
        Wir erweitern jetzt unser Beispiel um folgende Funktionalität:

        Wir möchten in Zukunft in der Lage sein, auch gebrauchte Artikel zu verkaufen.
        Diese gebrauchten Artikel werden dabei mit einem (je nach Zustand für den Artikel individuellen) Rabatt verkauft.

        Außerdem soll aus der Artikel-Beschreibung sofort ersichtlich sein, dass der Artikel gebraucht ist.

        Decorator Pattern
        Bereiten Sie die Klasse Article so vor, dass sie dekoriert werden kann.
        Erstellen Sie einen Decorator namens "SecondHandArticle" mit folgenden Funktionen
        Rabattiert den Preis um eine festzulegenden Prozentsatz
        Ändert die Artikel-Beschreibung, so dass sofort ersichtlich ist, dass der Artikel gebraucht ist - z.B. durch das Suffix " (gebraucht)"
     */
  //endregion

  //region Observer
    /*
        Wir erweitern jetzt unser Beispiel um folgende Funktionalität:

        Wir möchten benachrichtigt werden, wenn neue Einträge ins Journal eingetragen werden.
        Aus diesem Grunde implementieren wir einen "JournalListener" (Observer-Pattern).

        CustomerDb
        Wir möchten nun eine Kundendatenbank (Collection von Receiver-Objekten) für Marketing-Zwecke anlegen.

        Natürlich soll diese Datenbank immer auf dem aktuellsten Stand sein. Deshalb wird automatisch beim Eintrag einer Rechnung ins Journal der jeweilige Rechnungs-Empfänger in die Kundendatenbank aufgenommen.
        Logischerweise sollen in der Datenbank keine Duplikate vorkommen.
     */
  //endregion
}