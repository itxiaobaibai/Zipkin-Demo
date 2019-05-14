# Zipkin-Demo

Zipkin 链路追踪 demo

$ git init
$ git add README.MD
$ git commit -m "第一次提交"

*** Please tell me who you are.
Run
  git config --global user.email "you@example.com"
  git config --global user.name "Your Name"
to set your account's default identity.
Omit --global to set the identity only in this repository.
fatal: unable to auto-detect email address (got 'baijunfeng@DESKTOP-3RDVGR2.(none)')

baijunfeng@DESKTOP-3RDVGR2 MINGW64 /e/Program Files/GitHub (master)
$ git config --global user.email "itbaijunfengvip@163.com"

baijunfeng@DESKTOP-3RDVGR2 MINGW64 /e/Program Files/GitHub (master)
$ git commit -m "第一次提交"''
[master (root-commit) 16c50ab] 第一次提交
 1 file changed, 3 insertions(+)
 create mode 100644 README.MD

$ git remote add origin https://github.com/itxiaobaibai/Zipkin-Demo.git

baijunfeng@DESKTOP-3RDVGR2 MINGW64 /e/Program Files/GitHub (master)
$ git push -u origin master
fatal: AggregateException encountered.
   ▒▒▒▒һ▒▒▒▒▒▒▒▒▒▒
Username for 'https://github.com': itxiaobaibai
Counting objects: 3, done.
Writing objects: 100% (3/3), 266 bytes | 0 bytes/s, done.
Total 3 (delta 0), reused 0 (delta 0)
To https://github.com/itxiaobaibai/Zipkin-Demo.git
 * [new branch]      master -> master
Branch master set up to track remote branch master from origin.

然后提交项目：
baijunfeng@DESKTOP-3RDVGR2 MINGW64 /e/Program Files/GitHub (master)
$ git add Zipkin-Demo/tjw.zipkin

baijunfeng@DESKTOP-3RDVGR2 MINGW64 /e/Program Files/GitHub (master)
$ git add Zipkin-Demo/tjw.zipkin2

baijunfeng@DESKTOP-3RDVGR2 MINGW64 /e/Program Files/GitHub (master)
$ git add Zipkin-Demo/tjw.zipkin3

baijunfeng@DESKTOP-3RDVGR2 MINGW64 /e/Program Files/GitHub (master)
$ git add Zipkin-Demo/tjw.zipkin4

baijunfeng@DESKTOP-3RDVGR2 MINGW64 /e/Program Files/GitHub (master)
$ git add Zipkin-Demo/pom.xml

baijunfeng@DESKTOP-3RDVGR2 MINGW64 /e/Program Files/GitHub (master)
$ git commit -m "demo项目"
[master 91149c9] demo项目

然后push 到远程：
baijunfeng@DESKTOP-3RDVGR2 MINGW64 /e/Program Files/GitHub (master)
$ git push -u origin master
fatal: AggregateException encountered.
   ▒▒▒▒һ▒▒▒▒▒▒▒▒▒▒
Username for 'https://github.com': itxiaobaibai
Counting objects: 172, done.
Delta compression using up to 12 threads.
Compressing objects: 100% (142/142), done.
Writing objects: 100% (172/172), 40.07 KiB | 0 bytes/s, done.
Total 172 (delta 82), reused 0 (delta 0)
remote: Resolving deltas: 100% (82/82), done.
To https://github.com/itxiaobaibai/Zipkin-Demo.git
   16c50ab..91149c9  master -> master
Branch master set up to track remote branch master from origin.

