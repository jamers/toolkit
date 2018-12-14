# Git


###### Create a new repo and add it to github
```bash
echo "# test" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/jamers/test.git
git push -u origin master
```
###### Push a local repo into github
```bash
git remote add origin https://github.com/jamers/test.git
git push -u origin master
```
