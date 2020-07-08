# SAE Repository für Übungsaufgaben

### Allgemeine Hinweise

- Das Repository lässt sich nicht bearbeiten, wenn ich euch nicht als Collaborator hinzugefügt habe. Siehe unten!
- Bitte die Ordnerstruktur einhalten. Ich habe Beispieldateien hinterlegt, an denen man sich orientieren kann.
- Der Ordner src beinhaltet die Programme für die Lösungen.
- Lokale Settings (bspw. wenn ihr Eclipse verwendet) bitte in der .gitignore hinterlegen, sonst werden diese mitgepushed.

### GitHub

#### Git

- Die Versionskontrolle "Git" muss zuerst auf dem Computer installiert sein. Siehe: https://git-scm.com/downloads

#### User

- Erstellt euch einen GitHub Account und gebt mir bei Gelegenheit den Username an, sodass ich euch zum Repository einladen kann.
- Ihr erhaltet eine Email zur Bestätigung der Einladung.
- Eure User Credentials müssen lokal auf eurem Computer gespeichert sein, um Änderungen online stellen zu können. Gebt in der Konsole ein:
- git config user.name "Dein Username"
- git config user.email "Deine Emailadresse"

#### Befehle

- Git create branch from: Erstellt euren eigenen Branch zum Hinzufügen von Daten, nutzt als Ausgangslage den ausgewählten Branch.
- Git push: Schickt eure Änderungen an das Repository.
- Git fetch: Aktualisiert euren Branch mit den aktuellen Daten auf dem Repository.

#### Branches

- Lösungen bitte über einen seperaten Branch erstellen. Ich habe das direkte Pushen auf den master durch eine Regel deaktiviert.
- Immer einen Pull Request stellen, sodass man einen Code Review machen kann.
- Pull Requests niemals selbst mergen, immer den Reviewer mergen lassen!

### Benutzerordner

- Wer möchte, kann sich gerne einen eigenen Ordner für seine persönlichen Lösungen anlegen. Ich habe einen Beispielordner für mich als Referenz erstellt.

### Visual Studio Code

- Einleitung unter: https://code.visualstudio.com/docs/java/java-tutorial
- Zum gemeinsamen Programmieren die Extension Live Share installieren.

#### Java Runtime

- In Visual Studio Code muss der Pfad zur Java Runtime eventuell angepasst werden. Dies geht über Einstellungen. Gib im Suchfeld "Java:Home" ein, dort muss der Ordner deiner Java Runtime angegeben werden.

#### Linting

- Generell bitte die Linting-Regeln einhalten, die im Java Extension Pack integriert sind.
- Unnötige Regeln deaktivieren wir nach Absprache.
- Wenn ihr einen Grund habt eine Regel zu brechen, könnt ihr das Linting für die Zeile mit //NOSONAR deaktivieren.