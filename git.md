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
##### Log
```bash
git log # basic
git log --patch # or -p, shows diff per commit
git log -2 # limit to last 2 commits
git log --stat # show stats per commit
git log --pretty=oneline # or pretty=[short|full|fuller]
git log --pretty=format:"%h - %an, %ar : %s" # specify your own pretty format
git log --graph # show ascii graph
git log --pretty=format:"%h %s" --graph
git log --pretty="%h - %s" --author='Junio C Hamano' --since="2008-10-01" --before="2008-11-01" --no-merges -- t/
```
##### Log arguments
| Option | Result |
|-----|-----|
| -p | Show the patch introduced with each commit. |
| --stat | Show statistics for files modified in each commit. |
| --shortstat | Display only the changed/insertions/deletions line from the --stat command. |
| --name-only | Show the list of files modified after the commit information. |
| --name-status | Show the list of files affected with added/modified/deleted information as well. |
| --abbrev-commit | Show only the first few characters of the SHA-1 checksum instead of all 40. |
| --relative-date | Display the date in a relative format (for example, “2 weeks ago”) instead of using the full date format. |
| --graph | Display an ASCII graph of the branch and merge history beside the log output. |
| --pretty | Show commits in an alternate format. Options include oneline, short, full, fuller, and format (where you specify your own format). |
| --oneline | Shorthand for --pretty=oneline --abbrev-commit used together. |
##### Pretty arguments
| Option | Result |
|-----|-----|
| %H | Commit hash |
| %h | Abbreviated commit hash |
| %T | Tree hash |
| %t | Abbreviated tree hash |
| %P | Parent hashes |
| %p | Abbreviated parent hashes |
| %an | Author name |
| ae | Author email |
| ad | Author date (format respects the --date=option) |
| %ar | Author date, relative |
| %cn | Committer name |
| %ce | Committer email |
| %cd | Committer date |
| %cr | Committer date, relative |
| %s | Subject |

##### Undoing things
```bash
git commit -m 'initial commit'
git add forgotten_file
git commit --amend  # 'initial commit' will be completely replaced by amended
```

#### Move changes from master to branch (that is clean)
```bash
git status
> On branch master, ahead of origin/master by 2 commits

git checkout my-new-branch-that-is-clean-rebased-from-master
git merge master
> Updating blah

git status
> on branch my.... , ahead of origin/my... by two commits

git checkout master

git reset --head HEAD~2 # Push master back by two commits - losing the work
```
