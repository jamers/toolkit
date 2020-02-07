Notes from Bash Beginners Guide http://tldp.org/LDP/Bash-Beginners-Guide/html/sect_01_01.html

# sect_01_05
1  #!/bin/bash
2  clear
3  echo "This is information provided by mysystem.sh.  Program starts now."
4
5  echo "Hello, $USER"
6  echo
7
8  echo "Today's date is `date`, this is week `date +"%V"`."
9  echo
10
11  echo "These users are currently connected:"
12  w | cut -d " " -f 1 - | grep -v USER | sort -u
13  echo
14
15  echo "This is `uname -s` running on a `uname -m` processor."
16  echo
17
18  echo "This is the uptime information:"
19  uptime
20  echo
21
22  echo "That's all folks!"

#!/bin/bash
clear
printf "This is information provided by mysystem.sh.  Program starts now.\n"

printf "Hello, $USER.\n\n"

printf "Today's date is `date`, this is week `date +"%V"`.\n\n"

printf "These users are currently connected:\n"
w | cut -d " " -f 1 - | grep -v USER | sort -u
printf "\n"

printf "This is `uname -s` running on a `uname -m` processor.\n\n"

printf "This is the uptime information:\n"
uptime
printf "\n"

printf "That's all folks!\n"




#!/bin/bash
case "$1" in
'start')
    echo "x"
  ;;
'stop')
  echo "y"
  ;;
esac
exit 0
