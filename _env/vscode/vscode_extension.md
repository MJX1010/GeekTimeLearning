# VSCode 插件

* Remote SSH

  [配置Visual Studio Code的Remote - SSH插件进行远程开发](https://note.qidong.name/2019/08/vscode-remote-ssh/)






---



* 头部注释

  配置路径： “File”—“Preferences”—“User Snippets”

  ```  json
{
  	// Place your snippets for python here. Each snippet is defined under a snippet name and has a prefix, body and 
  	// description. The prefix is what is used to trigger the snippet and the body will be expanded and inserted. Possible variables are:
  	// $1, $2 for tab stops, $0 for the final cursor position, and ${1:label}, ${2:another} for placeholders. Placeholders with the 
  	// same ids are connected.
  	// Example:
  	// "Print to console": {
  	// 	"prefix": "log",
  	// 	"body": [
  	// 		"console.log('$1');",
  	// 		"$2"
  	// 	],
  	// 	"description": "Log output to console"
  	// }
  
  	"HEADER": {
  		"prefix" : "header",
  		"body": [
              "#!/usr/bin/env python",
              "# -*- encoding: utf-8 -*-",
              "'''",
  			"@File           : $TM_FILENAME",
              "@Time           : $CURRENT_YEAR/$CURRENT_MONTH/$CURRENT_DATE $CURRENT_HOUR:$CURRENT_MINUTE:$CURRENT_SECOND",
  			"@Author         : mjx",
  			"@Version        : 1.0.0",
  			"@Desc           : ",
              "'''",
  			"",
  			"",
  			"$0"
  		],
  	}
  }
  ```
  
  ``` json
{
  	// Place your snippets for shellscript here. Each snippet is defined under a snippet name and has a prefix, body and 
  	// description. The prefix is what is used to trigger the snippet and the body will be expanded and inserted. Possible variables are:
  	// $1, $2 for tab stops, $0 for the final cursor position, and ${1:label}, ${2:another} for placeholders. Placeholders with the 
  	// same ids are connected.
  	// Example:
  	// "Print to console": {
  	// 	"prefix": "log",
  	// 	"body": [
  	// 		"console.log('$1');",
  	// 		"$2"
  	// 	],
  	// 	"description": "Log output to console"
  	// }
  
  	"HEADER": {
  		"prefix" : "header",
  		"body": [
              "#!/bin/bash ",
              "###################################################################",
  			"#File           : $TM_FILENAME",
              "#Time           : $CURRENT_YEAR/$CURRENT_MONTH/$CURRENT_DATE $CURRENT_HOUR:$CURRENT_MINUTE:$CURRENT_SECOND",
  			"#Author         : mjx",
  			"#Version        : 1.0.0",
  			"#Desc           : ",
              "###################################################################",
  			"",
  			"",
  			"$0"
  		],
  	}
  }
  ```
  
  

