# Астахов Илья. Группа 4830

# Операционные системы и виртуализация (Linux)

## Использование команды `cat` в Linux

### Создание текстовых файлов

- Создать два текстовых файла: "Pets"(Домашние животные) и "Pack
  animals"(вьючные животные), используя команду `cat` в терминале Linux. В
  первом файле перечислить собак, кошек и хомяков. Во втором — лошадей,
  верблюдов и ослов.
- Объединить содержимое этих двух файлов в один и просмотреть его
  содержимое.
- Переименовать получившийся файл в "Human Friends"(.
  Пример конечного вывода после команды “ls” :
  Desktop Documents Downloads HumanFriends.txt Music PackAnimals.txt
  Pets.txt Pictures Videos
```` bash
ilya@ilya-Linux:~$ cat Pets
собаки
кошки
хомяки
ilya@ilya-Linux:~$ cat PackAnimals
лошади
верблюды
ослы
````
```` bash
ilya@ilya-Linux:~$ cat Pets Pac_animals > "Human Friends"
ilya@ilya-Linux:~$ cat "Human Friends"
собаки
кошки
хомяки
лошади
верблюды
ослы
ilya@ilya-Linux:~$ ls
cd                   snap
clean_directory.sh   test_directory
dbui                 virtualbox-7.0_7.0.12-159484~Ubuntu~jammy_amd64.deb
dbui.sh              virtualbox-7.0_7.0.12-159484~Ubuntu~jammy_amd64.deb.1
homeWork             wordpress
'Human Friends'       Видео
newfile3             Документы
newfilenew           Загрузки
ownersort.sh         Изображения
Pac_animals          Музыка
Pack                 Общедоступные
Pets                'Рабочий стол'
shared               Шаблоны
```` 
## Работа с директориями в Linux
- Создать новую директорию и переместить туда файл "Human Friends".

```` bash
ilya@ilya-Linux:~$ mkdir Animals
ilya@ilya-Linux:~$ mv 'Human Friends' Animals
ilya@ilya-Linux:~$ cd Animals
ilya@ilya-Linux:~/Animals$ ll
итого 12
drwxrwxr-x  2 ilya ilya 4096 фев 12 20:39  ./
drwxr-x--- 22 ilya ilya 4096 фев 12 20:39  ../
-rw-rw-r--  1 ilya ilya   78 фев 12 20:15 'Human Friends'
````
# Работа с MySQL в Linux. “Установить MySQL на вашу вычислительную
машину ”
- Подключить дополнительный репозиторий MySQL и установить один из
  пакетов из этого репозитория.

```` bash
wget https://dev.mysql.com/get/mysql-apt-config_0.8.26-1_all.deb
sudo dpkg -i mysql-apt-config_0.8.26-1_all.deb
sudo apt install mysql-client mysql-community-server mysql-server
sudo apt update
sudo mysql_secure_installation
sudo mysql
Welcome to the MySQL monitor.  Commands end with ; or \g.
Your MySQL connection id is 10
Server version: 8.0.35-0ubuntu0.22.04.1 (Ubuntu)
````
## Управление deb-пакетами
- Установить и затем удалить deb-пакет, используя команду `dpkg`.
```` bash
sudo apt update
sudo apt install htop
sudo apt remove htop
````
##  История команд в терминале Ubuntu
- Сохранить и выложить историю ваших терминальных команд в Ubuntu.
  В формате: Файла с ФИО, датой сдачи, номером группы(или потока)
```` bash
760  cat > Pets <<EOF
собаки
кошки 
хомяки
EOF

  761  cat > Pack animals <<EOF
лошади
верблюды
ослы 
EOF

  762  cat > Pac_animals <<EOF
лошади
верблюды
ослы 
EOF

  763  cat Pets
  764  cat pac_animals
  765  ll
  766  cat pets
  767  cat Pets
  768  cat Pet_animals
  769  cat Pets
  770  cat Pac_animals
  771  cat Pets Pac_animals > "Human Friends"
  772  cat "Human Friends"
  773  ls
  774  mkdir Animals
  775  mv 'Human Friends' Animals
  776  cd Animals
  777  ll
  778  wget https://dev.mysql.com/get/mysql-apt-config_0.8.26-1_all.deb
  779  sudo dpkg -i mysql-apt-config_0.8.26-1_all.deb
  780  sudo apt install mysql-client mysql-community-server mysql-server
  781  sudo apt update
  782  sudo mysql_secure_installation
  783  sudo mysql
  784  sudo apt update
  785  sudo apt install htop
  786  history
````

# Объектно-ориентированное программирование

## Диаграмма классов
- Создать диаграмму классов с родительским классом "Животные", и двумя
  подклассами: "Pets" и "Pack animals".
  В составы классов которых в случае Pets войдут классы: собаки, кошки,
  хомяки, а в класс Pack animals войдут: Лошади, верблюды и ослы).
  Каждый тип животных будет характеризоваться (например, имена, даты
  рождения, выполняемые команды и т.д)
  Диаграмму можно нарисовать в любом редакторе, такими как Lucidchart,
  Draw.io, Microsoft Visio и других.
  ![Диаграмма классов](Diagram.png)


# Работа с MySQL
(Задача выполняется в случае успешного выполнения
   задачи “Работа с MySQL в Linux. “Установить MySQL на вашу машину”

   7.1. После создания диаграммы классов в 6 пункте, в 7 пункте база данных
   "Human Friends" должна быть структурирована в соответствии с этой
   диаграммой. Например, можно создать таблицы, которые будут
   соответствовать классам "Pets" и "Pack animals", и в этих таблицах будут поля,
   которые характеризуют каждый тип животных (например, имена, даты
   рождения, выполняемые команды и т.д.).


