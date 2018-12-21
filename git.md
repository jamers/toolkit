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
#### Find common ancestor of two branches
```
git merge-base branch2 branch3
050dc022f3a65bdc78d97e2b1ac9b595a924c3f2
```
