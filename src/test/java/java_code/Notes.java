package java_code;

public class Notes {
    /*
    1. git status
    2. git add color.txt                - to stage this file
    3. git commit -m "added blue color" - to commit changes
    4. git push                         - to send the changes to remote repository(github)
    5. git pull FROM
//Enumerating objects: 14, done.
//Counting objects: 100% (14/14), done.
//Delta compression using up to 8 threads
//Compressing objects: 100% (5/5), done.
//Writing objects: 100% (10/10), 939 bytes | 939.00 KiB/s, done.
//Total 10 (delta 0), reused 0 (delta 0)
//To https://github.com/IuliiaDenika/summer-va-2019-git-practice.git
//   0645005..07be39e  master -> master


5. CONFLICT if someone changed the same file but with another data BEFORE
CALLS merge CONFLICT:
        color.txt
Please commit your changes or stash them before you merge.
Aborting


 SOLUTION
 1. Stash changed. It' s when you save your changes on a side. Then, you can apply your changes
 avoid breaking a code dev stash changes and open them when they pulled and can continue development

 1. git pull
 2. git stash save "added cyber yellow and gold"
 3. git pull
 4. git stash list


 2. Discard changes. It's pretty much lose your updates. If some files conflicts you can discard your updates
 and pull code successfully


 git add .
 git commit -m "added white color"
 git pull
 conflict----> resolve conflicts file GIT




**************************************
 3. Resolve merge conflict right away
 1. add your file to the staging area git add
 2. commit changes
 3. pull updates from remote repository (git pull)
 4. open conflict files and either manually change them or use INTELLIJ conflict
 *** CONFLICT (content): Merge conflict in color.txt
Automatic merge failed; fix conflicts and then commit the result.***
=====- means where is a conflict in file
<<<<< HEAD under head - it is your changes
under ====== it is changes that someone else did it before you
Last commit changes
How to fix this conflict manually

Iuliias-MacBook-Pro:summer-va-2019-git-practice iuliiadenika$ git add color.txt
Iuliias-MacBook-Pro:summer-va-2019-git-practice iuliiadenika$ git commit -m "fixed merge conflict in color.txt file"
[master 334fba7] fixed merge conflict in color.txt file
Iuliias-MacBook-Pro:summer-va-2019-git-practice iuliiadenika$ git pull
Already up to date.
Iuliias-MacBook-Pro:summer-va-2019-git-practice iuliiadenika$

**************************************















     */
}
