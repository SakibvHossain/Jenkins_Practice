### Jenkins project view
![Project view on jenkins](https://github.com/SakibvHossain/Jenkins_Practice/assets/92059000/ccd05e63-31f5-475d-a49f-4361532bf339)

### Project builds
![build](https://github.com/SakibvHossain/Jenkins_Practice/assets/92059000/9bcbd085-b80e-42ff-a2cb-4b1961854e59)

### Email after each build
For enabling this follow the steps:
1.  Manage `jenkins` > `System` then scroll down find **E-mail Notification**
2.  On **SMTP server:** `smtp.gmail.com`
3.  **Default user e-mail suffix:** `@gmail.com`
4.  Click on Advanced. On **Click** on **Use SMTP Authentication** then provide username(email) & password(use app password other may fail)
5.  Click on **SSL**
6.  On **SMTP Port:** `465` this the port for gmail
7.  In **Reply-To Address** you can use another gmail on which reply will come
8.  Test it check if its working fine -> **Test configuration by sending test e-mail**      
![email](https://github.com/SakibvHossain/Jenkins_Practice/assets/92059000/d494fd17-03ed-4ca7-942b-62e8b715af49)

When your done then if your build failed. You'll get message like this:  
![error](https://github.com/SakibvHossain/Jenkins_Practice/assets/92059000/cf38c76d-2e98-45c4-ad85-6ef8574c2a69)

### CI / CD Pipeline  
Created 3 Jobs  
![pipeline](https://github.com/SakibvHossain/Jenkins_Practice/assets/92059000/230cd88f-b2dc-42d2-a55d-6f7da9410ffa)

### CI / CD Pipeline working perfectly  
![pipeline works perfectly](https://github.com/SakibvHossain/Jenkins_Practice/assets/92059000/ef2eaf5e-590a-4dbf-ac94-73c454bea9b9)
