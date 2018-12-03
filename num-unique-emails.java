class Solution {
    public int numUniqueEmails(String[] emails) {
        
        Set <String> mailsSet = new HashSet<>();
        
        for(int i = 0; i < emails.length; i++){
            
            String [] splittedEmail = emails[i].split("@");
            String local = splittedEmail[0];
            String domain = splittedEmail[1];
        
            local = local.replace(".","");
            local = local.replaceAll("\\+(.*)","");
            
            mailsSet.add(local+"@"+domain);
        }

        
        return mailsSet.size();
    }
}
