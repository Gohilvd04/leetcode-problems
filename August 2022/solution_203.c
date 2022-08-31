/**
 * Definition for singly-linked list.
 * struct ListNode {
 *     int val;
 *     struct ListNode *next;
 * };
 */


struct ListNode* removeElements(struct ListNode* head, int val)
{
    struct ListNode *p=head;
    while(p)
    {
        if(p->next && p->next->val==val)
        {
            p->next=p->next->next;
        }
        else
        {
           
            p=p->next;
        }
        
    }   
    
    if(head && head->val==val)
     return head->next;
    return head;
}