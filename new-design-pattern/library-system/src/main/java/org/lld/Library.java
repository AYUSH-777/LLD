package org.lld;

import java.util.*;

public class Library {

    private Map<String,Book> bookByIdMap ;
    private List<Copy> copyList;
    private List<Borrowed> borrowedList;
    private List<Fine> fineList;
    private Random random;

    public Library() {
        this.copyList = new ArrayList<>();
        this.borrowedList = new ArrayList<>();
        this.fineList = new ArrayList<>();
        this.bookByIdMap = new HashMap<>();
        this.random = new Random();
    }

    public void addCopy(Copy copy)
    {
        copyList.add(copy);
    }

    public void addBook(Book book)
    {
        bookByIdMap.put(book.getBookId(), book);
    }

    public String borrowBook(String bookName, String memberId)
    {
        for(Copy curCopy:copyList)
        {
            if(curCopy.getAvailable()&&bookByIdMap.get(curCopy.getBookId()).getBookName().equals(bookName))
            {
                curCopy.setAvailable(false);
                String borrowId = String.valueOf(random.nextInt(100));
                borrowedList.add(new Borrowed(borrowId, curCopy.getCopyId(), memberId,new Date(),null));
                return borrowId;
            }
        }
        return null;
    }

    public String isFine(String borrowId, String memberId)
    {
        Borrowed borrowed = getBorrowFromId(borrowId);
        String copyId = borrowed.getCopyId();
        Copy copy = getCopyFromId(copyId);
        copy.setAvailable(true);
        Date d1 = borrowed.getBorrowedDate();
        Date d2 = new Date();
        long difference_In_Time
                = d2.getTime() - d1.getTime();

        long difference_In_Hours
                = (difference_In_Time
                / (1000 * 60 * 60))
                % 24;
        if(difference_In_Hours>1)
        {
            String fineId = String.valueOf(random.nextInt(100));
            fineList.add(new Fine(fineId,memberId,100,borrowId));
            return fineId;
        }
        return null;
    }

    public Borrowed getBorrowFromId(String borrowId)
    {
        for(Borrowed curBorrow:borrowedList)
        {
            if(curBorrow.getBorrowId().equals(borrowId))
            {
                return curBorrow;
            }
        }
        return null;
    }

    public Copy getCopyFromId(String copyId)
    {
        for(Copy curCopy:copyList)
        {
            if(curCopy.getCopyId().equals(copyId))
            {
                return curCopy;
            }
        }
        return null;
    }
}
