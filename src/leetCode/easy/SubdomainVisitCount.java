package leetCode.easy;

import java.util.*;

//https://leetcode.com/problems/subdomain-visit-count/description/
//Each address will have either 1 or 2 "." characters.

public class SubdomainVisitCount {
    public List<String> subdomainVisits(String[] cpdomains) {
        if (cpdomains == null || cpdomains.length == 0) return Arrays.asList();

        Map<String, Integer> visitMap = new HashMap<>();

        for (String cpdomain: cpdomains) {
            String[] splits = cpdomain.split(" ");
            int number = Integer.parseInt(splits[0]);
            String domain = splits[1];
            visitMap.put(domain, visitMap.getOrDefault(domain,0) + number);
            while (domain.indexOf(".") != -1) {
                domain = domain.substring(domain.indexOf(".") + 1, domain.length());
                visitMap.put(domain, visitMap.getOrDefault(domain,0) + number);
            }
        }

        List<String> result = new ArrayList<>();
        for(Map.Entry<String, Integer> entry : visitMap.entrySet()){
            result.add(entry.getValue() + " " +  entry.getKey());
        }

        return result;
    }
}
