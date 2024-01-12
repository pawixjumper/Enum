package pl.gornik.doc;

import pl.gornik.shape.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        List<Document> docs = new ArrayList<>();
        docs.add(new Document("Certificate",2,DocumentType.CERTIFICATE,true));
        docs.add(new Document("receipt",1,DocumentType.INVOICE,true));
        docs.add(new Document("contract of employment",2,DocumentType.CONTRACT,true));
        docs.add(new Document("division of assets",2,DocumentType.NOTARIAL_ACT,false));
        docs.add(new Document("testament",2,DocumentType.NOTARIAL_ACT,true));


        System.out.println("Podaj nazwe dokumentu : ");
        String name = scanner.nextLine();
        System.out.println("Ile Stron : ");
        int pageCount = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Podaj id dokumentu : ");
        int docId = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Typ dokumentu : (faktura, kontrakt, akt notarialny, certyfikat) : ");
        String documentType = scanner.nextLine();
        System.out.println("Czy zatwierdzony (tak,nie)? : ");
        String confirmed = scanner.nextLine();
        boolean isConfirmed;
        if(confirmed.toLowerCase().equals("tak")){
            isConfirmed = true;
        }else isConfirmed = false;

        DocumentType docType = getDocumentType(documentType);
        DocumentType doccId = getDocumentId(docId);

        if(doccId != null) {
            docs.add(new Document(name,pageCount,doccId,isConfirmed));
        }else System.out.println("brak id");
        if(docType != null){
        docs.add(new Document(name,pageCount,docType,isConfirmed));}
        else System.out.println("zły typ dokumentu");

        for (Document docList:docs
             ) {
            System.out.println(docList.toString());
        }

    }
    public static DocumentType getDocumentType(String docType){
        switch (docType.toLowerCase()){
            case "faktura" -> {
                return DocumentType.INVOICE;

            }
            case "kontrakt" ->{
                return DocumentType.CONTRACT;
            }
            case "akt notarialny" ->{
                return DocumentType.NOTARIAL_ACT;
            }
            case "certyfikat" ->{
                return DocumentType.CERTIFICATE;
            }
            default -> {
                return null;
            }
        }
    }
    public static DocumentType getDocumentId(int docId){
        if(docId >=0 && docId < 2) {
            switch (docId) {
                case 0 -> {
                    return DocumentType.INVOICE;
                }
                case 1 -> {
                    return DocumentType.CERTIFICATE;
                }
                default -> {
                    return null;
                }

            }
        }else return null;
    }
}
