# Git

## Useful links
* Pro Git 2 - https://git-scm.com/book/en/v2

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
##### Rebase a feature branch
```bash
# On branch master
git checkout BREX-358-mi-control-reference-data-checks
git checkout feature/ESB-10743-rec-210-reconcile-goldensource-asset-data-to-cdw

```
##### Remove files from working tree and staging
```bash
# delete the file on disc
# the file will still show up in git status, but unstaged
rm file.txt

# add the deletion to staging
git rm file.txt

# remove file from tracking, but not working directory (e.g. accidentally added .iml file)
git rm --cached \*.iml

# git mv can be used as a shortcut for renaming
git mv README.md README
# is equivalent to
mv README.md README
git rm README.md
git add README

```
